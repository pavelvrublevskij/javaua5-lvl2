package lt.codeacademy.javaua5.lvl2.generics.inheritance.task1;

import java.util.Arrays;
import java.util.List;

public class SpikyLeafTreeTask {

    public static void main(String[] args) {
		final List<Tree> trees = List.of(
                new BirchTree(),
                new OakTree(),
                new JuniperTree(),
                new SpruceTree(),
                new PineTree());
        forest(trees);

		final List<SpikyTree> spikyTrees = List.of(
                new JuniperTree(),
                new SpruceTree(),
                new PineTree());
        spikyForest(spikyTrees);

		final List<SpruceTree> spruceTrees = List.of(
				new SpruceTree(),
				new SpruceTree());
		spikyForest(spruceTrees);

		final List<BirchTree> birchTrees = List.of(
                new BirchTree(),
                new BirchTree(),
                new BirchTree());
        birchForest(birchTrees);
    }

	public static void forest(final List<? extends Tree> treeList) {
		System.out.println("\nIvairus miskas:");
		treeList.stream()
				.map(Tree::get)    // :: - method reference
				.forEach(System.out::println);  // :: - method reference
	}

	public static void spikyForest(final List<? extends SpikyTree> treeList) {
		System.out.println("\nSpygliuociu miskas:");
		treeList.stream()
				.map(SpikyTree::get)
				.forEach(System.out::println);
	}

	public static void birchForest(final List<BirchTree> treeList) {
		System.out.println("\nBerzu miskas:");
		treeList.stream()
				.map(BirchTree::get)
				.forEach(System.out::println);
	}
}
