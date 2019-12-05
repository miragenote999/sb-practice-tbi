package tbi.practice.sbpracticetbi.dto;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class BusSchedule {
    private String busStop;
    private String route;
    private String direction;
    private String dayType;
    private LocalTime depatureTime;
    private String destination;

    public BusSchedule(String busStop, String route, String direction, String dayType, LocalTime depatureTime, String destination) {
        this.busStop = busStop;
        this.route = route;
        this.direction = direction;
        this.dayType = dayType;
        this.depatureTime = depatureTime;
        this.destination = destination;
    }

    public String getBusStop() {
        return busStop;
    }

    public String getRoute() {
        return route;
    }

    public String getDirection() {
        return direction;
    }

    public String getDayType() {
        return dayType;
    }

    public LocalTime getDepatureTime() {
        return depatureTime;
    }

    public String getDestination() {
        return destination;
    }
}
