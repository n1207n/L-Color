package silin.color.object;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class Color {

    /**
     * An array of sample (dummy) items.
     */
    public static List<ColorItem> ITEMS = new ArrayList<ColorItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, ColorItem> ITEM_MAP = new HashMap<String, ColorItem>();

    static {
        // Add 3 sample items.
        addItem(new ColorItem("1", "Red"));
        addItem(new ColorItem("2", "Yellow"));
        addItem(new ColorItem("3", "Green"));
        addItem(new ColorItem("4", "Blue"));
    }

    private static void addItem(ColorItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class ColorItem {
        public String id;
        public String content;

        public ColorItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
