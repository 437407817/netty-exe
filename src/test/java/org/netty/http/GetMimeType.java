package org.netty.http;

import javax.activation.MimetypesFileTypeMap;
import java.io.File;

class GetMimeType {
public static void main(String args[]) {
File f = new File("gumby.gif");
System.out.println("Mime Type of " + f.getName() + " is " + 
new MimetypesFileTypeMap().getContentType(f));
// expected output : 
// "Mime Type of gumby.gif is image/gif"
}
}