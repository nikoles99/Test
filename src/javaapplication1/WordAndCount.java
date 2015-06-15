package javaapplication1;

public class WordAndCount implements Comparable<WordAndCount>{    
    private String word;
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public String getWord() {
        return word;
    }

    public WordAndCount(String word,Integer count) {
        this.count = count;
        this.word = word;
    }   
    
    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof WordAndCount){
            WordAndCount wordAndCount=(WordAndCount)obj;    
            return wordAndCount.getWord().equals(this.getWord());
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + word.hashCode();
        result = prime * result + count;
        return result;
    }    
    
    @Override
    public int compareTo(WordAndCount frequencyTable) {
        Integer compareValue=frequencyTable.getCount();      
        return compareValue.compareTo(this.count);
    }
}
