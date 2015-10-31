(ns optimal-stops.penalty)

(def OPTIMAL-DISTANCE 200)

(defn cost
  "Determine the cost of travelling from mp[i] to mp[j]
  when goal is OPTIMAL-DISTANCE per leg."
  [i j mp]
  (let [root (- OPTIMAL-DISTANCE (- (mp j) (mp i)))]
    (* root root)))
