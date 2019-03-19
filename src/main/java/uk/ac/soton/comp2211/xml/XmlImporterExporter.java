package uk.ac.soton.comp2211.xml;

import uk.ac.soton.comp2211.Application;
import uk.ac.soton.comp2211.ApplicationData;
import uk.ac.soton.comp2211.model.RunwayObstacle;
import javax.xml.bind.*;
import java.io.File;

public class XmlImporterExporter {
    private File file;
    private Application application;
    private JAXBContext context;


    public XmlImporterExporter(File file, Application application) throws JAXBException {
        this.file = file;
        this.application = application;

        this.context = JAXBContext.newInstance(ApplicationData.class, RunwayObstacle.class);
    }

    public void exportXML() throws JAXBException {
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(application.getData(), file);
    }

    public void importXML() throws JAXBException {
        Unmarshaller unmarshaller = context.createUnmarshaller();
        ApplicationData applicationData = (ApplicationData) unmarshaller.unmarshal(file);
        application.setData(applicationData);
        application.createMainframe();
    }
}
