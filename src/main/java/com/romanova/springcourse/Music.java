package com.romanova.springcourse;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public interface Music {

    List<String> getSong();


}
