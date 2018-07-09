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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class DsidClient {
  private static final Logger logger = Logger.getLogger(DsidClient.class.getName());

  private final ManagedChannel channel;
  private final DsidServicoGrpc.DsidServicoBlockingStub blockingStub;

  /** Construct client connecting to Dsid server at {@code host:port}. */
  public DsidClient(String host, int port) {
    this(ManagedChannelBuilder.forAddress(host, port)
        .usePlaintext()
        .build());
  }

  DsidClient(ManagedChannel channel) {
    this.channel = channel;
    blockingStub = DsidServicoGrpc.newBlockingStub(channel);
  }

  public void shutdown() throws InterruptedException {
    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
  }

  public void sendString(String name) {
    
    StringRequest request = StringRequest.newBuilder().setName(name).build();
    StringReply response;
    
    try {
      response = blockingStub.sayString(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      return;
    }
} 
  
  public void sendLong(long number) {

    LongRequest request = LongRequest.newBuilder().setReqLong(number).build();
    LongReply response;
    try {
      response = blockingStub.sayLong(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      return;
    }
  }

  public void sendVoid() {

    VoidRequest request = VoidRequest.newBuilder().build();
    VoidReply response;
    try {
      response = blockingStub.sayVoid(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      return;
    }
  }
 
  public void sendVarLong(Long[] arrayLong) {

    Iterable<Long> ite = Arrays.asList(arrayLong);

    VarLongRequest request = VarLongRequest.newBuilder().addAllReqLongArray(ite).build();
    VarLongReply response;
    try {
      response = blockingStub.sayVarLong(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      return;
    }
  }

  public void sendPerson(Person pessoa) {

    Person request = pessoa;
    PersonReply response;
    try {
      response = blockingStub.sayPerson(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      return;
    }
  }

  public void sendVarPerson(String[] nomes) {

    Random rand = new Random();
    ArrayList<Person> aux = new ArrayList<>();
    
    for(String s:nomes){
      aux.add(Person.newBuilder().setName(s)
                                 .setEmail(s + "@mail.com")
                                 .addPhones(
                                     Person.PhoneNumber.newBuilder()
                                     .setNumber("666-"+ rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10))
                                     .setType(Person.PhoneType.HOME))
                                 .build());
    }
    
    Iterable<Person> ite = aux;

    VarPerson request = VarPerson.newBuilder().addAllArrayPerson(ite).build();
    VarPersonReply response;
    
    try {
      response = blockingStub.sayVarPerson(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      return;
    }
  }
}
