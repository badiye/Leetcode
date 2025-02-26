import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> newAsteroids = new ArrayList<>();
        int i = 0;       
        while (i < asteroids.length) {
            if (newAsteroids.isEmpty() || asteroids[i] > 0) {
                newAsteroids.add(asteroids[i]);
                i++;
            } else {
                int top = newAsteroids.get(newAsteroids.size() - 1);
                if (top > 0 && asteroids[i] < 0) {
                    if (Math.abs(top) > Math.abs(asteroids[i])) {
                        i++;
                    } else if (Math.abs(top) < Math.abs(asteroids[i])) {
                        newAsteroids.remove(newAsteroids.size() - 1);
                    } else {
                        newAsteroids.remove(newAsteroids.size() - 1);
                        i++;
                    }
                } else {
                    newAsteroids.add(asteroids[i]);
                    i++;
                }
            }
        }
        int[] result = new int[newAsteroids.size()];
        for (int j = 0; j < newAsteroids.size(); j++) {
            result[j] = newAsteroids.get(j);
        }
        return result;
    }
}
