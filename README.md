# irksome-octo-tatertot
# Dynamic programming to determine optimal stops

Given a set of mileposts along a route and a penalty function that determines the cost of traveling from stop i to j, calculate a set of optimal stops.

Using brute-force, this problem is O(2<sup>N</sup>), where N is the number of stops.  (For each potential stop, we either stop there or not.)

With dynamic programing, it is O(N): calculate optimal number of stops for 1, 2, ..., N-1, and N stops, where each calculation is either a base case or uses a previously calculated optimum.
