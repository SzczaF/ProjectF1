package pl.coderslab.projectf1.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.projectf1.model.Constructor;
import pl.coderslab.projectf1.repository.ConstructorRepository;


public class ConstructorConverter implements Converter<String, Constructor> {
    @Autowired
    private ConstructorRepository categoryRepository;

    @Override
    public Constructor convert(String s) {
        return categoryRepository.getReferenceById(Integer.parseInt(s));
    }
}