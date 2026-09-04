package com.electronik54.revision_3.corejava.ch103_abstract_factory;

/**
 * Challenge 103: Abstract Factory Pattern
 *
 * Problem:
 * Create a UI toolkit that produces coherent "families" of components.
 * AbstractFactory (UIFactory) with LightUI and DarkUI concrete factories.
 * Each factory creates a Button and a Checkbox that match its theme.
 *
 * Hint:
 * - Define abstract products: Button, Checkbox (interfaces)
 * - Define the abstract factory interface: createButton(), createCheckbox()
 * - LightUI / DarkUI implement the factory and return themed products
 * - Client works with interfaces only
 *
 * Expected Output:
 * Light UI Button: [LightButton]
 * Light UI Checkbox: (checked: LightCheckbox)
 * Dark UI Button: [DarkButton]
 * Dark UI Checkbox: (checked: DarkCheckbox)
 *
 * TODO:
 * 1. Create Button and Checkbox interfaces
 * 2. Create LightButton, DarkButton, LightCheckbox, DarkCheckbox
 * 3. Create UIFactory interface; LightUIFactory and DarkUIFactory
 * 4. Build and render both themes
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 103: Abstract Factory Pattern ===");
    }
}