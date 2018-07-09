/*
 * Copyright 2015 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.grpc.dsid.testes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class DsidServer {
  private static final Logger logger = Logger.getLogger(DsidServer.class.getName());

  private Server server;

  private void start() throws IOException {
    /* The port on which the server should run */
    int port = 50051;
    server = ServerBuilder.forPort(port)
        .addService(new DsidServicoImpl())
        .build()
        .start();
    logger.info("Server started, listening on " + port);
    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
        // Use stderr here since the logger may have been reset by its JVM shutdown hook.
        System.err.println("*** shutting down gRPC server since JVM is shutting down");
        DsidServer.this.stop();
        System.err.println("*** server shut down");
      }
    });
  }

  private void stop() {
    if (server != null) {
      server.shutdown();
    }
  }

  /**
   * Await termination on the main thread since the grpc library uses daemon threads.
   */
  private void blockUntilShutdown() throws InterruptedException {
    if (server != null) {
      server.awaitTermination();
    }
  }

  /**
   * Main launches the server from the command line.
   */
  public static void main(String[] args) throws IOException, InterruptedException {
    final DsidServer server = new DsidServer();
    server.start();
    server.blockUntilShutdown();
  }

  static class DsidServicoImpl extends DsidServicoGrpc.DsidServicoImplBase {

    @Override
    public void sayString(StringRequest req, StreamObserver<StringReply> responseObserver) {

      //Dá um append de "String" ao string recebido na resposta a ser enviada
      StringReply reply = StringReply.newBuilder().setMessage("String " + req.getName()).build();
      responseObserver.onNext(reply);
      responseObserver.onCompleted();
    }

    @Override
    public void sayLong(LongRequest req, StreamObserver<LongReply> responseObserver) {
      LongReply reply = LongReply.newBuilder().setReplyLong(req.getReqLong()).build();
      responseObserver.onNext(reply);
      responseObserver.onCompleted();
    }

    @Override
    public void sayVoid(VoidRequest req, StreamObserver<VoidReply> responseObserver) {
      VoidReply reply = VoidReply.newBuilder().build();
      responseObserver.onNext(reply);
      responseObserver.onCompleted();
    }

    @Override
    public void sayVarLong(VarLongRequest req, StreamObserver<VarLongReply> responseObserver) {

      //Inicializa um ArrayList de Long, que é a resposta a ser enviada de volta
      ArrayList<Long> arrayLongResp = new ArrayList<Long>();
      //Adiciona todos os valores que foram enviados para o servidor no array de resposta
      arrayLongResp.addAll(req.getReqLongArrayList());

      Random rand = new Random();

      //Para todos os valores dentro do array de resposta, subtrai n/(aleatório de 1 a 5) do valor n
      for(Long num:arrayLongResp){
        num -= num/(rand.nextInt(4) + 1);
      }

      //Cria um Iterable com a resposta para poder enviar de volta 
      Iterable<Long> ite = arrayLongResp;

      VarLongReply reply = VarLongReply.newBuilder().addAllReplyLongArray(ite).build();
      responseObserver.onNext(reply);
      responseObserver.onCompleted();
    }

    @Override
    public void sayPerson(Person req, StreamObserver<PersonReply> responseObserver) {
      
      Random rand = new Random();
      
      //Cria a resposta do tipo Pessoa dando um id e setando um status para a pessoa
      PersonReply reply = PersonReply.newBuilder()
                                     .setName(req.getName())
                                     .setId(rand.nextInt(10000))
                                     .setStat(PersonReply.Status.CADASTRADO)
                                     .build();
      responseObserver.onNext(reply);
      responseObserver.onCompleted();
    }

    @Override
    public void sayVarPerson(VarPerson req, StreamObserver<VarPersonReply> responseObserver) {
      
      Random rand = new Random();
      ArrayList<PersonReply> aux = new ArrayList<>();
      
      for(Person p:req.getArrayPersonList()){
        aux.add(PersonReply.newBuilder()
                           .setName(p.getName())
                           .setId(rand.nextInt(10000))
                           .setStat(PersonReply.Status.CADASTRADO)
                           .build());
      }

      //Cria a resposta do tipo Pessoa dando um id e setando um status para a pessoa
      Iterable<PersonReply> ite = aux;

      VarPersonReply reply = VarPersonReply.newBuilder().addAllArrayPersonReply(ite).build();
      responseObserver.onNext(reply);
      responseObserver.onCompleted();
    }
  }
}
