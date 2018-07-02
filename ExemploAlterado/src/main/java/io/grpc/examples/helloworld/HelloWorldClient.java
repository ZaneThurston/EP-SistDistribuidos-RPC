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

package io.grpc.examples.helloworld;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple client that requests a greeting from the {@link HelloWorldServer}.
 */
public class HelloWorldClient {
  private static final Logger logger = Logger.getLogger(HelloWorldClient.class.getName());

  private final ManagedChannel channel;
  private final GreeterGrpc.GreeterBlockingStub blockingStub;

  /** Construct client connecting to HelloWorld server at {@code host:port}. */
  public HelloWorldClient(String host, int port) {
    this(ManagedChannelBuilder.forAddress(host, port)
        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
        // needing certificates.
        .usePlaintext()
        .build());
  }

  /** Construct client for accessing RouteGuide server using the existing channel. */
  HelloWorldClient(ManagedChannel channel) {
    this.channel = channel;
    blockingStub = GreeterGrpc.newBlockingStub(channel);
  }

  public void shutdown() throws InterruptedException {
    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
  }

  /** Say hello to server. */
  public void greet(String name) {
    
    HelloRequest request = HelloRequest.newBuilder().setName(name).build();
    HelloReply response;
    
    try {
      response = blockingStub.sayHello(request);
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
	 
  public void sendEightLong(Long[] arrayLong) {

    Iterable<Long> ite = Arrays.asList(arrayLong);

    EightLongRequest request = EightLongRequest.newBuilder().addAllReqLongArray(ite).build();
    EightLongReply response;
    try {
      response = blockingStub.sayEightLong(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      return;
    }
  }

  /**
   * Greet server. If provided, the first element of {@code args} is the name to use in the
   * greeting.
   */
  public long computeString(String text, int it) {
    long time = 0, time1, time2;

    for (int i = 0; i<it; i++) {
      time1 = System.currentTimeMillis();
      greet(text);
      time2 = System.currentTimeMillis();
      time += (time2 - time1);
    }

    time = time / it;
    return time;
  }

  public long computeLong(long num, int it) {
    long time = 0, time1, time2;
    for (int i = 0; i<it; i++) {
      time1 = System.currentTimeMillis();
      sendLong(num);
      time2 = System.currentTimeMillis();
      time += (time2 - time1);
    }
    time = time / it;
    return time;
  }

  public static void main(String[] args) throws Exception {
    HelloWorldClient client = new HelloWorldClient("localhost", 50051);
    try {
      /* Access a service running on the local machine on port 50051 */
      String user = "world";
      int it = 30;
      long num = 132057000;
      System.out.println("Tempo medio para string com "+it+" iteracoes: "+client.computeString(user, it));
      System.out.println("Tempo medio para long com "+it+" iteracoes: "+client.computeLong(num, it));
    } finally {
      client.shutdown();
    }
  }
}
