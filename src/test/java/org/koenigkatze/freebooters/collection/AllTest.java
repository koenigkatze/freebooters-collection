package org.koenigkatze.freebooters.collection;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.koenigkatze.freebooters.collection.card.CardBuilderUnknownCreationTest;
import org.koenigkatze.freebooters.collection.repository.CardUniqueIdRepositoryTest;

@RunWith(Suite.class)
@SuiteClasses({ 
	CardBuilderUnknownCreationTest.class, 
	CardUniqueIdRepositoryTest.class 
	})
public class AllTest {

}
