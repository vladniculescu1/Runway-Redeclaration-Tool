package uk.ac.soton.comp2211.xml;

import uk.ac.soton.comp2211.Main;
import uk.ac.soton.comp2211.model.RunwayObstacle;
import javax.xml.bind.*;
import java.io.File;
import java.util.jar.JarException;

public class XmlImporterExporter {
    private File file;
    private XmlContainer xmlContainer;
    private JAXBContext context;


    public XmlImporterExporter(File file, XmlContainer xmlContainer) throws JAXBException {
        this.file = file;
        this.xmlContainer = xmlContainer;

        this.context = JAXBContext.newInstance(XmlContainer.class, RunwayObstacle.class);
    }

    public void exportXML() throws JAXBException {
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(xmlContainer, file);
    }

    public void importXML() throws JAXBException {
        Unmarshaller unmarshaller = context.createUnmarshaller();
        XmlContainer xmlContainer = (XmlContainer) unmarshaller.unmarshal(file);
        Main.disposeWindow();
        Main.createWindow(xmlContainer);
    }
}
