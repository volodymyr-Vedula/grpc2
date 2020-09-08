import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(8080)
                .addService(new ServiceImpl()).build();

        server.start();
        System.out.println("Server start on localhost:8080");
        server.awaitTermination();
    }
}
