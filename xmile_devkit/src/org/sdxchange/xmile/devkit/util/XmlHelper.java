package org.sdxchange.xmile.devkit.util;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringWriter;
import java.net.URL;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlHelper<T> {

    public T unmarshall(File file, Class<T> target){
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(target.getClass());
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            T objModel = (T) jaxbUnmarshaller.unmarshal(file);
            return objModel;
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public String marshal( T target){
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(target.getClass());
            StringWriter writer = new StringWriter();
            Marshaller jaxB = jaxbContext.createMarshaller();
            // output pretty printed
            jaxB.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxB.marshal(target, writer);
            return writer.toString() ;
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }



    public T unmarshall(String resource, String pkgName){
        JAXBContext jaxbContext;
        //try simple file access first
        Exception error = null;
        String currentDir = Paths.get(".").toAbsolutePath().normalize().toString();
        String path = currentDir + File.separator + resource;
        try {
            File file = new File(path);
            if (file.exists() && ! file.isDirectory() ){

                jaxbContext = JAXBContext.newInstance(pkgName);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                T objModel = (T) jaxbUnmarshaller.unmarshal(file);
                return objModel;
            }
            else {
                throw new FileNotFoundException("Can't find file at "+path);
            }
        } catch (Exception e){
            error = e;
            //save it in case we can't find as resource either.
        }


        try {
            URL url =  this.getClass().getResource(resource);
            String resourcePath = url.getFile();
            File file = new File(resourcePath);
            jaxbContext = JAXBContext.newInstance(pkgName);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            T objModel = (T) jaxbUnmarshaller.unmarshal(file);
            return objModel;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;

    }
/*
	public static void main(String[] args) {

		File file = new File(args[1]);
		XmlHelper<Xmile> app = new XmlHelper<Xmile>();
		Xmile document = app.unmarshall(file, Xmile.class);
		System.out.println(document);

	}
 */
}
