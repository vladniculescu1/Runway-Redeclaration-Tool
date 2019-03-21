package uk.ac.soton.comp2211.xml;

import uk.ac.soton.comp2211.ApplicationData;
import uk.ac.soton.comp2211.model.RunwayObstacle;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * This class handles xml import and export of the application data.
 */
public class XmlImporterExporter {

    private File file;
    private JAXBContext context;


    /**
     * Constructor creates a new JAXB context.
     *
     * @param file the file used for import/export
     * @throws JAXBException if context could not be created
     */
    public XmlImporterExporter(File file) throws JAXBException {
        this.file = file;
        this.context = JAXBContext.newInstance(ApplicationData.class, RunwayObstacle.class);
    }

    /**
     * Exports the given application data to xml.
     *
     * @param data the application data to be exported
     * @throws JAXBException in case of error during export
     */
    public void exportXml(ApplicationData data) throws JAXBException {
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(data, file);
    }

    /**
     * Reads xml file and constructs application data from it.
     *
     * @return the application data from the xml file
     * @throws JAXBException in case of error during import
     */
    public ApplicationData importXml() throws JAXBException {
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (ApplicationData) unmarshaller.unmarshal(file);
    }
}
