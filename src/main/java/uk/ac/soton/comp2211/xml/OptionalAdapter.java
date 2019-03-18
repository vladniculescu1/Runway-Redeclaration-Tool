package uk.ac.soton.comp2211.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.Optional;

public class OptionalAdapter extends XmlAdapter<Object, Optional<?>> {


    @Override
    public Optional<?> unmarshal(Object obj) throws Exception {
        return Optional.of(obj);
    }

    @Override
    public Object marshal(Optional<?> optional) throws Exception {
        return optional.orElse(null);
    }
}
