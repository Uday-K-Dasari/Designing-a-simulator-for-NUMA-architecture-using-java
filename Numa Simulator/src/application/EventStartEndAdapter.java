
package application;

import systree.EventAdapter;



public class EventStartEndAdapter {
    public EventAdapter start;
    public EventAdapter end;
    public double startTime;
    public double endTime;
    public EventStartEndAdapter() {
    }

    public EventStartEndAdapter(EventAdapter start, EventAdapter end) {
        this.start = start;
        this.end = end;
    }

    public EventStartEndAdapter(EventAdapter start) {
        this.start = start;
    }

    public EventAdapter getStart() {
        return start;
    }

    public void setStart(EventAdapter start) {
        this.start = start;
    }

    public EventAdapter getEnd() {
        return end;
    }

    public void setEnd(EventAdapter end) {
        this.end = end;
    }

}