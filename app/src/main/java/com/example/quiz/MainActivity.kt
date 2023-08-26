package com.example.quiz

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt_Start = findViewById<Button>(R.id.rectangle_1)
        val text_line = findViewById<TextView>(R.id.match_the_c)
        val answer = findViewById<TextView>(R.id.answer)
        val ll = findViewById<LinearLayout>(R.id.ll)
        val img_1 = findViewById<ImageView>(R.id.img_1)
        val img_2 = findViewById<ImageView>(R.id.img_2)
        val img_3 = findViewById<ImageView>(R.id.img_3)

        bt_Start.setOnClickListener{
            text_line.setTextSize(20F)
            text_line.setText("Мистер и миссис Дёрсли, обитатели дома № 4 по Бирючинному проезду, всегда могли с гордостью заявить: «Мы абсолютно нормальные люди, и слава богу».")
            bt_Start.visibility = GONE
            ll.visibility = VISIBLE
        }
        var i = 0
            img_1.setOnClickListener(){
                if(i == 0){
                    i++
                    text_line.setText("Алиса начала очень скучать: она сидела рядом с сестрой на берегу и ничего не делала.")
                    answer.append("Вопрос №$i : Верно\n")
                    img_1.setImageResource(R.drawable.oblomov)
                    img_2.setImageResource(R.drawable.uchitel)
                    img_3.setImageResource(R.drawable.alisa)
                }else if (i == 1){
                    i++
                    text_line.setText("В ворота гостиницы губернского города NN въехала довольно красивая рессорная небольшая бричка...")
                    answer.append("Вопрос №$i : Неверно\n")
                    img_1.setImageResource(R.drawable.dushi)
                    img_2.setImageResource(R.drawable.harry)
                    img_3.setImageResource(R.drawable.master)
                }else if (i == 2){
                    i++
                    text_line.setText("Все счастливые семьи похожи друг на друга, каждая несчастливая семья несчастлива по-своему.")
                    answer.append("Вопрос №$i : Верно\n")
                    img_1.setImageResource(R.drawable.ostrov)
                    img_2.setImageResource(R.drawable.karenina)
                    img_3.setImageResource(R.drawable.uchitel)
                }else if (i == 3){
                    i++
                    text_line.setText("Однажды весною, в час небывало жаркого заката, в Москве, на Патриарших прудах, появились два гражданина.")
                    answer.append("Вопрос №$i : Неверно\n")
                    img_1.setImageResource(R.drawable.prestuplenie)
                    img_2.setImageResource(R.drawable.dushi)
                    img_3.setImageResource(R.drawable.master)
                }else if (i == 4){
                    i++
                    text_line.setText("В Гороховой улице, в одном из больших домов, народонаселения которого стало бы на целый уездный город, лежал утром в постели, на своей квартире, Илья Ильич Обломов.")
                    answer.append("Вопрос №$i : Неверно\n")
                    img_1.setImageResource(R.drawable.ostrov)
                    img_2.setImageResource(R.drawable.oblomov)
                    img_3.setImageResource(R.drawable.voina)
                }else if (i == 5){
                    i++
                    text_line.setText("— Мы поднимаемся?")
                    answer.append("Вопрос №$i : Неверно\n")
                    img_1.setImageResource(R.drawable.alisa)
                    img_2.setImageResource(R.drawable.ostrov)
                    img_3.setImageResource(R.drawable.prestuplenie)
                }else if (i == 6){
                    i++
                    text_line.setText("В начале июля, в чрезвычайно жаркое время, под вечер, один молодой человек вышел из своей каморки...")
                    answer.append("Вопрос №$i : Неверно\n")
                    img_1.setImageResource(R.drawable.prestuplenie)
                    img_2.setImageResource(R.drawable.voina)
                    img_3.setImageResource(R.drawable.karenina)
                }else if (i == 7){
                    i++
                    text_line.setText("Я открываю настежь окна.")
                    answer.append("Вопрос №$i : Верно\n")
                    img_1.setImageResource(R.drawable.harry)
                    img_2.setImageResource(R.drawable.dushi)
                    img_3.setImageResource(R.drawable.uchitel)
                }else if (i == 8){
                    i++
                    text_line.setText("– Еh bien, mon prince.")
                    answer.append("Вопрос №$i : Неверно\n")
                    img_1.setImageResource(R.drawable.oblomov)
                    img_2.setImageResource(R.drawable.voina)
                    img_3.setImageResource(R.drawable.harry)
                }else if (i == 9){
                    i++
                    answer.append("Вопрос №$i : Неверно\n")
                    ll.visibility = GONE
                    text_line.visibility = GONE
                    answer.visibility = VISIBLE
                }
            }
            img_2.setOnClickListener(){
                if(i == 0){
                    i++
                    text_line.setText("Алиса начала очень скучать: она сидела рядом с сестрой на берегу и ничего не делала.")
                    answer.append("Вопрос №$i : Неверно\n")
                    img_1.setImageResource(R.drawable.oblomov)
                    img_2.setImageResource(R.drawable.uchitel)
                    img_3.setImageResource(R.drawable.alisa)
                } else if (i == 1){
                    i++
                    text_line.setText("В ворота гостиницы губернского города NN въехала довольно красивая рессорная небольшая бричка...")
                    answer.append("Вопрос №$i : Неверно\n")
                    img_1.setImageResource(R.drawable.dushi)
                    img_2.setImageResource(R.drawable.harry)
                    img_3.setImageResource(R.drawable.master)
                }else if (i == 2){
                    i++
                    text_line.setText("Все счастливые семьи похожи друг на друга, каждая несчастливая семья несчастлива по-своему.")
                    answer.append("Вопрос №$i : Неерно\n")
                    img_1.setImageResource(R.drawable.ostrov)
                    img_2.setImageResource(R.drawable.karenina)
                    img_3.setImageResource(R.drawable.uchitel)
                }else if (i == 3){
                    i++
                    text_line.setText("Однажды весною, в час небывало жаркого заката, в Москве, на Патриарших прудах, появились два гражданина.")
                    answer.append("Вопрос №$i : Верно\n")
                    img_1.setImageResource(R.drawable.prestuplenie)
                    img_2.setImageResource(R.drawable.dushi)
                    img_3.setImageResource(R.drawable.master)
                }else if (i == 4){
                    i++
                    text_line.setText("В Гороховой улице, в одном из больших домов, народонаселения которого стало бы на целый уездный город, лежал утром в постели, на своей квартире, Илья Ильич Обломов.")
                    answer.append("Вопрос №$i : Неверно\n")
                    img_1.setImageResource(R.drawable.ostrov)
                    img_2.setImageResource(R.drawable.oblomov)
                    img_3.setImageResource(R.drawable.voina)
                }else if (i == 5){
                    i++
                    text_line.setText("— Мы поднимаемся?")
                    answer.append("Вопрос №$i : Верно\n")
                    img_1.setImageResource(R.drawable.alisa)
                    img_2.setImageResource(R.drawable.ostrov)
                    img_3.setImageResource(R.drawable.prestuplenie)
                }else if (i == 6){
                    i++
                    text_line.setText("В начале июля, в чрезвычайно жаркое время, под вечер, один молодой человек вышел из своей каморки...")
                    answer.append("Вопрос №$i : Верно\n")
                    img_1.setImageResource(R.drawable.prestuplenie)
                    img_2.setImageResource(R.drawable.voina)
                    img_3.setImageResource(R.drawable.karenina)
                }else if (i == 7){
                    i++
                    text_line.setText("Я открываю настежь окна.")
                    answer.append("Вопрос №$i : Неверно\n")
                    img_1.setImageResource(R.drawable.harry)
                    img_2.setImageResource(R.drawable.dushi)
                    img_3.setImageResource(R.drawable.uchitel)
                }else if (i == 8){
                    i++
                    text_line.setText("– Еh bien, mon prince.")
                    answer.append("Вопрос №$i : Неверно\n")
                    img_1.setImageResource(R.drawable.oblomov)
                    img_2.setImageResource(R.drawable.voina)
                    img_3.setImageResource(R.drawable.harry)
                }else if (i == 9){
                    i++
                    answer.append("Вопрос №$i : Верно\n")
                    ll.visibility = GONE
                    text_line.visibility = GONE
                    answer.visibility = VISIBLE
                }
            }
            img_3.setOnClickListener(){
                if(i == 0){
                    i++
                    text_line.setText("Алиса начала очень скучать: она сидела рядом с сестрой на берегу и ничего не делала.")
                    answer.append("Вопрос №$i : Неверно\n")
                    img_1.setImageResource(R.drawable.oblomov)
                    img_2.setImageResource(R.drawable.uchitel)
                    img_3.setImageResource(R.drawable.alisa)
                } else if (i == 1){
                    i++
                    text_line.setText("В ворота гостиницы губернского города NN въехала довольно красивая рессорная небольшая бричка...")
                    answer.append("Вопрос №$i : Верно\n")
                    img_1.setImageResource(R.drawable.dushi)
                    img_2.setImageResource(R.drawable.harry)
                    img_3.setImageResource(R.drawable.master)
                }else if (i == 2){
                    i++
                    text_line.setText("Все счастливые семьи похожи друг на друга, каждая несчастливая семья несчастлива по-своему.")
                    answer.append("Вопрос №$i : Неерно\n")
                    img_1.setImageResource(R.drawable.ostrov)
                    img_2.setImageResource(R.drawable.karenina)
                    img_3.setImageResource(R.drawable.uchitel)
                }else if (i == 3){
                    i++
                    text_line.setText("Однажды весною, в час небывало жаркого заката, в Москве, на Патриарших прудах, появились два гражданина.")
                    answer.append("Вопрос №$i : Неверно\n")
                    img_1.setImageResource(R.drawable.prestuplenie)
                    img_2.setImageResource(R.drawable.dushi)
                    img_3.setImageResource(R.drawable.master)
                }else if (i == 4){
                    i++
                    text_line.setText("В Гороховой улице, в одном из больших домов, народонаселения которого стало бы на целый уездный город, лежал утром в постели, на своей квартире, Илья Ильич Обломов.")
                    answer.append("Вопрос №$i : Верно\n")
                    img_1.setImageResource(R.drawable.ostrov)
                    img_2.setImageResource(R.drawable.oblomov)
                    img_3.setImageResource(R.drawable.voina)
                }else if (i == 5){
                    i++
                    text_line.setText("— Мы поднимаемся?")
                    answer.append("Вопрос №$i : Неверно\n")
                    img_1.setImageResource(R.drawable.alisa)
                    img_2.setImageResource(R.drawable.ostrov)
                    img_3.setImageResource(R.drawable.prestuplenie)
                }else if (i == 6){
                    i++
                    text_line.setText("В начале июля, в чрезвычайно жаркое время, под вечер, один молодой человек вышел из своей каморки...")
                    answer.append("Вопрос №$i : Неверно\n")
                    img_1.setImageResource(R.drawable.prestuplenie)
                    img_2.setImageResource(R.drawable.voina)
                    img_3.setImageResource(R.drawable.karenina)
                }else if (i == 7){
                    i++
                    text_line.setText("Я открываю настежь окна.")
                    answer.append("Вопрос №$i : Неверно\n")
                    img_1.setImageResource(R.drawable.harry)
                    img_2.setImageResource(R.drawable.dushi)
                    img_3.setImageResource(R.drawable.uchitel)
                }else if (i == 8){
                    i++
                    text_line.setText("– Еh bien, mon prince.")
                    answer.append("Вопрос №$i : Верно\n")
                    img_1.setImageResource(R.drawable.oblomov)
                    img_2.setImageResource(R.drawable.voina)
                    img_3.setImageResource(R.drawable.harry)
                }else if (i == 9){
                    i++
                    answer.append("Вопрос №$i : Неверно\n")
                    ll.visibility = GONE
                    text_line.visibility = GONE
                    answer.visibility = VISIBLE
                }
            }



    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            this.window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_FULLSCREEN
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)
        }
    }
}