class UndergroundSystem {
public:
    map<int, pair<string, int>> in;
    map<pair<string, string>, pair<double, double>> dape;
    UndergroundSystem() {
    }
    
    void checkIn(int id, string s, int t) {
        in[id] = {s, t};
    }
    
    void checkOut(int id, string s, int t) {
        double avg = double((t - in[id].second));
        dape[{in[id].first, s}].first += avg;
        dape[{in[id].first, s}].second += 1;
    }
    
    double getAverageTime(string s, string e) {
        double ans = dape[{s, e}].first;
        return ans / dape[{s,e}].second;
    }
};

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem* obj = new UndergroundSystem();
 * obj->checkIn(id,stationName,t);
 * obj->checkOut(id,stationName,t);
 * double param_3 = obj->getAverageTime(startStation,endStation);
 */