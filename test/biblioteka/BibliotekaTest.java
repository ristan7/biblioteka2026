package biblioteka;

import biblioteka.interfejs.BibliotekaInterface;
import biblioteka.interfejs.BibliotekaInterfaceTest;

class BibliotekaTest extends BibliotekaInterfaceTest {
	
	@Override
	public BibliotekaInterface getInstance() {
		return new Biblioteka();
	}

}
