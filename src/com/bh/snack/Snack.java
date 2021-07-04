package com.bh.snack;

import java.util.Iterator;
import java.util.Set;

public class Snack {

    private String flavor;
    private int calory;

    public Snack(){}

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getCalory() {
        return calory;
    }

    public void setCalory(int calory) {
        this.calory = calory;
    }

    public Snack(String flavor, int calory) {
        this.flavor = flavor;
        this.calory = calory;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "flavor='" + flavor + '\'' +
                ", calory=" + calory +
                '}';
    }

    /*
    main 에서 실행 내용
    HashMap<String, Snack> map = new HashMap();

        map.put("다이제", new Snack("초코맛",1500));
        map.put("칸초", new Snack("단맛",600));
        map.put("코코볼", new Snack("단맛", 2000));
        map.put("프랫즐", new Snack("짠맛",15000));
        map.put("홈런볼", new Snack("부드럽다", 3000));

       if(map.containsKey("칸초")) {
           System.out.println("칸초가 잴 맛있지");
       }

       //순서가 없는 HashMap을 순서대로 뽑아 내기

       Set<Map.Entry<String, Snack>> set = map.entrySet();
       Iterator<Map.Entry<String, Snack>> it = set.iterator();

       while(it.hasNext()){
           Map.Entry<String, Snack> e = it.next();
           System.out.println("종류: " + e.getKey() + ", value : " + e.getValue().getFlavor());
       }
            Set keyset = map.keySet();
            Iterator itKey = keyset.iterator();

               while(itKey.hasNext()){
                String key = (String)itKey.next();
                System.out.println("key:" + key + ", value :" + map.get(key));
            }

        }
     */
}
