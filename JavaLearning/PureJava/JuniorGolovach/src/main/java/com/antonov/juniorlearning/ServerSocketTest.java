/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.antonov.juniorlearning;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Antonov
 */
public class ServerSocketTest {
    
    
    
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(82, 256);
        
        while(true){
            System.out.println("0");
            Socket s = socket.accept();
            System.out.println("1");
        }
    }
}
