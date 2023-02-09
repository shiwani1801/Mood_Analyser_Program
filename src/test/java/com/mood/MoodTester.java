package com.mood;

import com.mood.analyzer.MoodAnalyzer;
import com.mood.analyzer.MoodAnalyzerEnum;
import com.mood.analyzer.MoodAnalyzerException;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MoodTester {

    MoodAnalyzer obj = new MoodAnalyzer();
    MoodAnalyzer a = new MoodAnalyzer("I am in Happy mood");
    MoodAnalyzer b = new MoodAnalyzer("I am in Sad mood");
    MoodAnalyzer c = new MoodAnalyzer("I am in Any mood");

    @Test
    public void testMood() {
        assertEquals("Happy" , a.analyseMood());
        assertEquals("Sad" , b.analyseMood());
        assertEquals("Happy" , c.analyseMood());
    }

    @Test
    public void testAnotherMood() {
        assertEquals("Sad" , obj.checkMood("Sad"));
        assertEquals("Happy" , obj.checkMood("Happy"));
    }
    @Test
    public void testNullMood() throws MoodAnalyzerException {
        System.out.println(MoodAnalyzer.invalidMoodAnalyser(null));
    }
    @Test
    public void testEmptyMood() {
        System.out.println(MoodAnalyzer.invalidMoodAnalyser(String.valueOf(MoodAnalyzerEnum.invalidMood)));
        System.out.println(MoodAnalyzer.invalidMoodAnalyser(String.valueOf(MoodAnalyzerEnum.empty)));
    }
}
