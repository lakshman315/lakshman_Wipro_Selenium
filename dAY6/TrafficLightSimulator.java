package dAY6;

interface State {
    State next();
}

enum TrafficLight implements State {
    RED {
       
        public State next() {
            return GREEN;
        }
    },
    GREEN {
       
        public State next() {
            return YELLOW;
        }
    },
    YELLOW {
      
        public State next() {
            return RED;
        }
    };
}

public class TrafficLightSimulator {
    public static void main(String[] args) {
        State currentState = TrafficLight.RED;
        System.out.println("Starting at: " + currentState);
        
        for (int i = 1; i <= 6; i++) {
            currentState = currentState.next();
            System.out.println("Transition " + i + ": " + currentState);
        }
    }
}
