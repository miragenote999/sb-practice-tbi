package tbi.practice.sbpracticetbi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tbi.practice.sbpracticetbi.dto.BusSchedule;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@RestController
@RequestMapping("/fixbusschedule")
public class BusScheduleApi {
    @GetMapping
    public BusSchedule getFixBusSchedule() {
        return new BusSchedule("豊洲駅", "エアポートリムジン", "羽田空港行", "平日",
                LocalTime.of(12,0), "羽田空港国際線ターミナル");
    }
}
