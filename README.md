# irksome-octo-tatertot
# Dynamic programming to determine optimal stops

Given a set of mileposts along a route and a penalty function that determines the cost of traveling from stop i to j, calculate a set of optimal stops.

A penalty function might reward trips as close as possible to 200 miles per leg, while discouraging longer or shorter trips.  One redendering would be 
(200 - (mp[j] - mp[i]))<sup>2</sup> -- the square of the difference between the amount travelled and 200 miles.

Using brute-force, this problem is O(2<sup>N</sup>), where N is the number of stops.  (For each potential stop, we either stop there or not.)

With dynamic programing, it is O(N): calculate optimal number of stops for 1, 2, ..., N-1, and N stops, where each calculation is either a base case or uses a previously calculated optimum.
