package pl.coderslab.projectf1.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.projectf1.model.Race;
import pl.coderslab.projectf1.repository.RaceRepository;

public class RaceConverter implements Converter<String, Race> {
    @Autowired
    private RaceRepository raceRepository;

    @Override
    public Race convert(String s) {
        return raceRepository.getReferenceById(Integer.parseInt(s));
    }

}
