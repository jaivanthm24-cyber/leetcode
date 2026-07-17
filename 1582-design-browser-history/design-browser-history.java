class BrowserHistory {
    private String[] history;
    private int current;
    private int end;
    
    public BrowserHistory(String homepage) {
        history = new String[101]; // start with reasonable capacity
        history[0] = homepage;
        current = 0;
        end = 0;
    }
    
    public void visit(String url) {
        current++;
        // If we exceed array size, double it
        if (current == history.length) {
            String[] newHistory = new String[history.length * 2];
            System.arraycopy(history, 0, newHistory, 0, history.length);
            history = newHistory;
        }
        history[current] = url;
        end = current;
    }
    
    public String back(int steps) {
        current = Math.max(0, current - steps);
        return history[current];
    }
    
    public String forward(int steps) {
        current = Math.min(end, current + steps);
        return history[current];
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */