package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Author  : Maulana Rasoky Nasution");
        System.out.println("Website : https://mul-code.blogspot.com\n");
        Function function = new Function(8);

        function.insertVertex("Ranca Upas");
        function.insertVertex("Jalan Braga");
        function.insertVertex("Danau Tangkuban Perahu");
        function.insertVertex("Gedung Sate");
        function.insertVertex("Trans Studio");
        function.insertVertex("Danau Situ Patenggang");
        function.insertVertex("Kawah Putih");
        function.insertVertex("Kawah Putih Ciwidey");

        function.insertEdge("Ranca Upas", "Jalan Braga");
        function.insertEdge("Ranca Upas", "Danau Tangkuban Perahu");
        function.insertEdge("Ranca Upas", "Gedung Sate");
        function.insertEdge("Ranca Upas", "Kawah Putih Ciwidey");
        function.insertEdge("Jalan Braga", "Ranca Upas");
        function.insertEdge("Jalan Braga", "Trans Studio");
        function.insertEdge("Danau Tangkuban Perahu", "Ranca Upas");
        function.insertEdge("Danau Tangkuban Perahu", "Gedung Sate");
        function.insertEdge("Danau Tangkuban Perahu", "Kawah Putih");
        function.insertEdge("Gedung Sate", "Ranca Upas");
        function.insertEdge("Gedung Sate", "Danau Tangkuban Perahu");
        function.insertEdge("Gedung Sate", "Trans Studio");
        function.insertEdge("Trans Studio", "Jalan Braga");
        function.insertEdge("Trans Studio", "Danau Tangkuban Perahu");
        function.insertEdge("Trans Studio", "Danau Situ Patenggang");
        function.insertEdge("Trans Studio", "Kawah Putih Ciwidey");
        function.insertEdge("Danau Situ Patenggang", "Trans Studio");
        function.insertEdge("Danau Situ Patenggang", "Kawah Putih Ciwidey");
        function.insertEdge("Kawah Putih", "Danau Tangkuban Perahu");
        function.insertEdge("Kawah Putih", "Kawah Putih Ciwidey");
        function.insertEdge("Kawah Putih Ciwidey", "Ranca Upas");
        function.insertEdge("Kawah Putih Ciwidey", "Trans Studio");
        function.insertEdge("Kawah Putih Ciwidey", "Danau Situ Patenggang");
        function.insertEdge("Kawah Putih Ciwidey", "Kawah Putih");

        System.out.println("========================");
        System.out.println("\t Binary Display");
        System.out.println("========================");
        function.display();
        System.out.println("\nBFS Display");
        function.displayBFS();
        System.out.println();
        System.out.println("\nDFS Display");
        function.displayDFS();
        System.out.println();
    }
}
