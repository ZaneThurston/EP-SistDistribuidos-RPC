# Comparação entre mecanismos RPC

Medição de tempos de execução entre gRPC e RPyC

# Como rodar

### gRPC

Você deve ter o JDK instalado com as variáveis de ambiente configuradas corretamente


1. Entre no caminho 
    ```
    gRPC/src/main/java/io/grpc/dsid/testes/Main.java
    ```
 
   e altere a variável ip para o ip da máquina onde rodará o servidor
   (o padrão é localhost, para rodar o servidor e o cliente na mesma máquina)


    ```
    static String ip = "localhost";
    ```

2. Na pasta gRPC, rode o comando gradlew para compilar o projeto

    No Linux:

    ```
    ./gradlew installDist
    ```

    No Windows:

    ```
    gradlew.bat installDist
    ```
    
    Deverá aparecer uma mensagem dizendo que a construção foi bem-sucedida.
    

3. Agora você poderá rodar o servidor e o cliente. Na pasta gRPC também, basta executar os seguintes comandos em terminais diferentes

      ___No Linux___:
      
      __Servidor__:
      ```
      ./build/install/examples/bin/dsid-testes-server
      ```
    
      __Cliente__:
      ```
      ./build/install/examples/bin/Main
      ```
      
      ___No Windows___:
      
      __Servidor__:
      ```
      build/install/examples/bin/dsid-testes-server.bat
      ```
    
      __Cliente__:
      ```
      build/install/examples/bin/Main.bat
      ```
      
### RPyC

É necessário ter o Python 3 instalado.

1. Entre na pasta rpyc e altere o arquivo _rpc-client-py_ para colocar o ip da máquina onde rodará o servidor

    ```
    ip = "localhost"
    ```
    
2. Em terminais diferentes, rode os programas do servidor:

    ```
    python rpc-server.py
    ```
    
   E cliente
    ```
    python rpc-client.py
    ```
       
