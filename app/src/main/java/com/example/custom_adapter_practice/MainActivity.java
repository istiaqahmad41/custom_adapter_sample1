package com.example.custom_adapter_practice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ListView news_listView;
    String [] news_h={
            "ব্যবসায়ীকে মারধরের অভিযোগে জগন্নাথ বিশ্ববিদ্যালয় ছাত্রলীগের সহসভাপতির বিরুদ্ধে মামলা ",
            "বাঙালির গৌরবময় সংগ্রামের মহাকাব্যিক দৃশ্যমালা ",
            "জীববৈচিত্র্যের ক্ষতি নিরূপণে কমিটি গঠন",
            "ফিলিস্তিনে গণহত্যা নিয়ে দৃকে আলোকচিত্র প্রদর্শনী"


    };
    String []news_hd ={

            "জগন্নাথ বিশ্ববিদ্যালয় শাখা ছাত্রলীগের এক সহসভাপতি ও তাঁর কয়েক অনুসারীর বিরুদ্ধে মারধর ও ছিনতাইয়ের অভিযোগে মামলা করেছেন এক ফল ব্যবসায়ী। গতকাল রোববার ঢাকার চিফ মেট্রোপলিটন ম্যাজিস্ট্রেট আদালতে মামলাটি করা হয়। ঘটনা তদন্তে পুলিশ ব্যুরো অব ইনভেস্টিগেশনকে (পিবিআই) দায়িত্ব দিয়েছেন আদালত। \n" +
                    "\n" +
                    "রাজধানীর সদরঘাটের ওই ব্যবসায়ীর নাম ফয়সাল হেলাল। মামলায় বিশ্ববিদ্যালয় শাখা ছাত্রলীগের সহসভাপতি মহিউদ্দিন অনিসহ পাঁচ নেতা-কর্মীর নাম উল্লেখ করা হয়েছে। বাকিরা হলেন—সৌরভ হাওলাদার, রিপন, হাসিবুল হাসান ও হিমু। এ ছাড়া অজ্ঞাতনামা তিন থেকে পাঁচজনকে আসামি করা হয়েছে। ",

            "সাদাকালো ছবিটি নির্বাক। কিন্তু কণ্ঠস্বরের চেয়ে যেন বেশি তীব্র শিশুটির আর্তনাদের এই ছবি। তার উদোম গা। গলায় মাদুলি ঝোলানো। বয়স হবে বড়জোর তিন-চার বছর। অশ্রু টলমল করেছে বিস্ফোরিত দুই চোখে। হাড়–জিরজিরে চেহারা। চিৎকার করছে শিশুটি। ক্ষুধার যন্ত্রণায়। ভারতে আশ্রয় নেওয়া উদ্বাস্তু বাংলাদেশি কোনো এক মায়ের এই ক্ষুধার্ত শিশুর ছবি তুলেছিলেন বিখ্যাত আলোকচিত্রী রঘু রাই।\n" +
                    "\n" +
                    "ভারতের দ্য স্টেটমেন্ট পত্রিকার প্রধান আলোকচিত্র সাংবাদিক রঘু রাই মুক্তিযুদ্ধের সময় ভারতের আশ্রয়শিবির ঘুরে ঘুরে উদ্বাস্তু বাংলাদেশিদের অবর্ণনীয় কষ্টের জীবনযাত্রা তুলে ধরেন তাঁর ক্যামেরায়। পাশাপাশি জীবনের ঝুঁকি নিয়ে মুক্তিযুদ্ধকালে বাংলাদেশে প্রবেশ করে মুক্তিযোদ্ধাদের প্রত্যক্ষ যুদ্ধের দৃশ্য এবং চূড়ান্ত বিজয়ের পর বিজয়ী মুক্তিযোদ্ধাদের দেশে ফেরা ও পাকিস্তানি বাহিনীর আত্মসমর্পণের দৃশ্যও তাঁর ক্যামেরায় ধারণ করেছিলেন। তাঁর তোলা ছবিগুলো একদিকে যেমন বাংলাদেশের মুক্তিযুদ্ধের ইতিহাসের এক অমূল্য দলিল হয়ে আছে, তেমনি ছবিগুলো ব্যক্তিগতভাবে তাঁকেও আলোকচিত্রী হিসেবে আন্তর্জাতিক খ্যাতি এনে দিয়েছে।",

            "সুন্দরবনে আগুনের ঘটনায় জীববৈচিত্র্যের ক্ষতি নিরূপণে সাত সদস্যের উচ্চপর্যায়ের বিশেষজ্ঞ কমিটি গঠন করা হচ্ছে। খুলনা অঞ্চলের প্রধান বন সংরক্ষক মিহির কুমার দোকে আহ্বায়ক করে ওই কমিটিতে রাখা হচ্ছে বিভিন্ন বিশ্ববিদ্যালয়ের সংশ্লিষ্ট বিশেষজ্ঞ ও গবেষকদের। আগামী ১০ কার্যদিবসের মধ্যে ওই কমিটি প্রতিবেদন জমা দেবে।\n" +
                    "\n" +
                    "রোববার রাত দশটার দিকে সুন্দরবন পশ্চিম বন বিভাগের সম্মেলন কক্ষে আয়োজিত সংবাদ সম্মেলনে এসব কথা বলেন প্রধান বন সংরক্ষণ মো. আমীর হোসাইন চৌধুরী। তিনি বলেন, আগুন লাগার কারণ অনুসন্ধানে প্রাথমিকভাবে তিন সদস্যের একটি কমিটি গঠন করা হয়েছে। এ ছাড়া সাত সদস্যের উচ্চপর্যায়ের কমিটি জীববৈচিত্র্যের ক্ষতি নিরূপণ করবে।",

            "বিশ্ব মুক্ত গণমাধ্যম দিবস উপলক্ষে আলোচনা সভা ও আলোকচিত্র প্রদর্শনীর আয়োজন করেছে দৃক পিকচার লাইব্রেরি। রোববার সন্ধ্যায় রাজধানীর পান্থপথে দৃকপাঠ ভবনে ‘গাজা হলোকাস্ট: কিলিং দ্য ট্রুথটেলারস’ শীর্ষক প্রদর্শনীর আয়োজন করা হয়।\n" +
                    "\n" +
                    "গত ৭ অক্টোবর ফিলিস্তিনের গাজায় ইসরায়েলের নির্বিচার হামলার প্রতিবাদে আয়োজন করা হয় এই প্রদর্শনীর। ইসরায়েলের হামলায় নিহত সাংবাদিকদের ছবি স্থান পেয়েছে প্রদর্শনীতে। এটি তত্ত্বাবধান করছেন এ এস এম রেজাউর রহমান।"

    };

    Integer[]imageId={

            R.drawable.news1,
            R.drawable.news2,
            R.drawable.news3,
            R.drawable.news4

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        news_listView=(ListView)findViewById(R.id.list_view_news);

        myAdaptercodes my_custom_adapter = new myAdaptercodes(MainActivity.this,news_h,news_hd,imageId);
        news_listView.setAdapter(my_custom_adapter);


        news_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String headline = news_h[position];
                String description= news_hd[position];
                int image= imageId[position];
                Intent i = new Intent(getApplicationContext(), news_View.class);

                i.putExtra("headline",headline);
                i.putExtra("description",description);
                i.putExtra("image",image);
                startActivity(i);


            }
        });






    }
}