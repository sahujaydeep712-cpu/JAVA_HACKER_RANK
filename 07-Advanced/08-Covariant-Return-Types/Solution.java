import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem: Covariant Return Types
 * Domain: Java / Advanced
 * Author: Jaydeep Sahu (github.com/sahujaydeep712-cpu)
 *
 * Description:
 * Java allows covariant return types: an overriding method may return a subtype
 * of the type returned by the overridden method.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
class Flower {
    public String whatsYourName() {
        return "I have many names and types.";
    }
}

class Jasmine extends Flower {
    @Override
    public String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    public String whatsYourName() {
        return "Lily";
    }
}

class Region {
    public Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {
    @Override
    public Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {
    @Override
    public Lily yourNationalFlower() {
        return new Lily();
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String regionName = reader.readLine().trim();

        Region region = null;
        switch (regionName) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }

        if (region != null) {
            Flower flower = region.yourNationalFlower();
            System.out.println(flower.whatsYourName());
        }
    }
}
