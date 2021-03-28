# Question 1
The XML below lists four articles by four different authors. Your task is write code to generate a
matrix similar to the one shown:

solution:

```java
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class ParseXmlFile {
    public static void printMap(Map<String, List<Author>> ArticleAndAuthorMap){

        Iterator<Map.Entry<String, List<Author>>> itr = ArticleAndAuthorMap.entrySet().iterator();
        Set<String> uniqueAuthor = new HashSet<String>();
        while(itr.hasNext())
        {
            Map.Entry<String, List<Author>> entry = itr.next();

            for(Author author: entry.getValue()){
                uniqueAuthor.add(author.getFirstName() + "," + author.getLastName());
            }
        }

        StringBuffer authors = new StringBuffer();
        authors.append("\t").append("\t").append("\t");
        for(String auth: uniqueAuthor){
            authors.append(auth).append("\t");
        }
        System.out.println(authors);
        for(String auth: uniqueAuthor){

            System.out.println(auth);
                while(itr.hasNext()) {
                    Map.Entry<String, List<Author>> entry = itr.next();

                    for(Author author: entry.getValue()){
                        if(author.getLastName().concat(",").concat(author.getFirstName()).equals(auth)){
                            System.out.println(1);
                        }

                    }

                }
            }

    }

    public static void main(String[] args) {
        try {

            File file = new File("src/main/resources/file.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("Article");

            Map<String, List<Author>> ArticleAndAuthorMap = new HashMap<>();
            List<String> authorsL = new ArrayList<>();
            for (int itr = 0; itr < nodeList.getLength(); itr++) {
                Node node = nodeList.item(itr);
                List<Author> authorList = new ArrayList<>();
                String title = "";
                Author author1 = new Author();
                Author author2 = new Author();

                authorsL = new ArrayList<>();
                String authors = new String();
                if (node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) node;
                    title = eElement.getElementsByTagName("ArticleTitle").item(0).getTextContent();
                    author1.setFirstName(eElement.getElementsByTagName("ForeName").item(0).getTextContent());
                    author2.setFirstName( eElement.getElementsByTagName("ForeName").item(1).getTextContent());
                    author1.setLastName( eElement.getElementsByTagName("LastName").item(0).getTextContent());
                    author2.setLastName( eElement.getElementsByTagName("LastName").item(1).getTextContent());
                    author1.setInitials( eElement.getElementsByTagName("Initials").item(0).getTextContent());
                    author2.setInitials( eElement.getElementsByTagName("Initials").item(1).getTextContent());            
                    authors = author1.getFirstName() + ", " + author2.getFirstName();

                }
                authorsL.add(authors);
                authorList.add(author1);
                authorList.add(author2);
                ArticleAndAuthorMap.put(title, authorList);


            }
            ParseXmlFile.printMap(ArticleAndAuthorMap);

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }

        System.out.println();

    }
}


```


# Question 2
How would you design a test suite for the above application? You are not required to write any test
cases but to describe your thought processes.

Solution:

I would start by writing basic test cases such as 

1. If the file is empty 
2. If Tags are Open and closed properly.
3. To check if XML has any missing tags, Etc


# Question 3
The above XML format is very similar to the Medline dataset, which contains over 22 million
records. What problems do you foresee in scaling the above solution to these numbers of records.

Iterating over 22 million records will be a task time complixity problem O(n^2). we can use Parallel stream or Multi Thread environment here.  
