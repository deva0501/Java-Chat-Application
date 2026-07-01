# Java-Chat-Application
A simple client-server chat application using Java Socket Programming.

This project demonstrates how a client connects to a server using TCP/IP and sends a message.

---

## Features

-  Client-Server Architecture
-  TCP Socket Communication
-  Server listens on Port **5000**
-  Client connects using **localhost**
-  Client sends a message
-  Server receives and displays the message

---

##  Technologies Used

- Java 21
- IntelliJ IDEA Community Edition
- Java Socket Programming
- TCP/IP Networking

---

# Project Structure

```
ChatApplication
│
├── src
│   ├── Server.java
│   ├── Client.java
│
└── README.md
```

---

# Server Code

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try {

            ServerSocket serverSocket = new ServerSocket(5000);

            System.out.println("Server started...");
            System.out.println("Waiting for client...");

            Socket socket = serverSocket.accept();

            System.out.println("Client connected!");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            String message = reader.readLine();

            System.out.println("Client says: " + message);

            reader.close();
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

#  Client Code

```java
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        try {

            Socket socket = new Socket("localhost", 5000);

            System.out.println("Connected to Server!");

            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            writer.println("Hello Server!");

            writer.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

## output

## server:

<img width="1920" height="1080" alt="Screenshot (105)" src="https://github.com/user-attachments/assets/5ba93698-d9ab-42b4-9cef-c2f614896c0d" />

## client:

<img width="1920" height="1080" alt="Screenshot (106)" src="https://github.com/user-attachments/assets/54dd4a6d-e94e-4b87-84a2-dda72a3414c8" />


#  How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/YourUsername/Java-Client-Server.git
```

---

### 2. Open the Project

Open the project in **IntelliJ IDEA**.

---

### 3. Run the Server

Run `Server.java`

Output:

```
Server started...
Waiting for client...
```

---

### 4. Run the Client

Run `Client.java`

Client Output:

```
Connected to Server!
```

Server Output:

```
Server started...
Waiting for client...
Client connected!
Client says: Hello Server!
```

---

#  Project Workflow

```
        Client
           │
           │  "Hello Server!"
           ▼
    TCP Connection (Port 5000)
           │
           ▼
        Server
```

---

#  Concepts Covered

- Java Networking
- Socket Programming
- TCP/IP Communication
- Client-Server Architecture
- ServerSocket
- Socket
- BufferedReader
- PrintWriter
- InputStream & OutputStream

---

#  Future Improvements

- Two-way communication
- Continuous chat
- GUI using Java Swing
- Multi-client support
- Chat history storage
- User authentication

---

#  Author

**DEVANAND C**

 Learning Networking & Backend Development

---

##  Support

If you found this project helpful, please **star this repository** on GitHub.
````

