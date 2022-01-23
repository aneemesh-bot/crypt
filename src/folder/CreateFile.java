/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void createmd5() {
    try {
      File md = new File("C:\\Users\\aneem\\Documents\\NetBeansProjects\\JavaApplication1\\md5store.txt");
      if (md.createNewFile()) {
        System.out.println("File created: " + md.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }
    }
    public static void createsha1() {
    try {
      File sha1 = new File("C:\\Users\\aneem\\Documents\\NetBeansProjects\\JavaApplication1\\sha1store.txt");
      if (sha1.createNewFile()) {
        System.out.println("File created: " + sha1.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }
  }
    public static void createsha512() {
    try {
      File sha512 = new File("C:\\Users\\aneem\\Documents\\NetBeansProjects\\JavaApplication1\\sha512store.txt");
      if (sha512.createNewFile()) {
        System.out.println("File created: " + sha512.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }
  }
}
