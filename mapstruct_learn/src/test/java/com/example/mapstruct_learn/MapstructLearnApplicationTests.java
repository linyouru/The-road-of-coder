package com.example.mapstruct_learn;

import com.example.mapstruct_learn.entiy.Car;
import com.example.mapstruct_learn.mapper.PojoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MapstructLearnApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test() {
        PojoMapper mapper = PojoMapper.INSTANCE;
        mapper.carToCarDto(new Car());
    }

}
