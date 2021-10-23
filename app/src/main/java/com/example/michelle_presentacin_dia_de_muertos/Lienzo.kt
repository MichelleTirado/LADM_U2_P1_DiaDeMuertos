package com.example.michelle_presentacin_dia_de_muertos

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.CountDownTimer
import android.view.View

class Lienzo (p:MainActivity) : View(p){
    //VARIABLES MOVIMIENTO CALACA
    var xC = -600f //Entrada
    var incrementoX = 10 //Tiempo
    var escondida = true
    //var img = R.drawable.calaca2
    var img = R.drawable.ghostboo

    var trabajando = false

    val timer = object : CountDownTimer(2000,5) {
        override fun onTick(millisUntilFinished: Long) {
            xC += incrementoX

            if(xC <-10 && escondida == true){ //201

            }else {
                escondida = false
                if (xC <= -80) {
                    incrementoX *= -1
                    //img = R.drawable.calaca2
                    img = R.drawable.ghostboo

                }
                if (xC >= 900) { //500
                    incrementoX *= -1
                   // img = R.drawable.calaca1
                    img = R.drawable.ghost
                }
            }

            invalidate()
        }

        override fun onFinish() {
            start()
        }
    }

    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        val p = Paint()

        if(trabajando == false){
            timer.start()
            trabajando = true
        }

        c.drawARGB(255,7, 0, 57)

        //SUELO
        p.setColor(Color.rgb(45,87,44))

        c.drawRect(0f,1200f,1080f,1776f,p)

        //LUNA
        p.setColor(Color.rgb(255,255,255))

        c.drawCircle(100f,100f,300f,p)




        //ESTRELLAS
        p.setColor(Color.WHITE)
        c.drawCircle(500f,200f,5f,p)
        p.setColor(Color.argb(150,255,255,255))
        c.drawCircle(500f,200f,9f,p)

        p.setColor(Color.WHITE)
        c.drawCircle(640f,470f,5f,p)
        p.setColor(Color.argb(150,255,255,255))
        c.drawCircle(640f,470f,9f,p)

        p.setColor(Color.WHITE)
        c.drawCircle(760f,30f,5f,p)
        p.setColor(Color.argb(150,255,255,255))
        c.drawCircle(760f,30f,9f,p)

        p.setColor(Color.WHITE)
        c.drawCircle(1000f,200f,5f,p)
        p.setColor(Color.argb(150,255,255,255))
        c.drawCircle(1000f,200f,9f,p)

        p.setColor(Color.WHITE)
        c.drawCircle(100f,700f,5f,p)
        p.setColor(Color.argb(150,255,255,255))
        c.drawCircle(100f,700f,9f,p)

        p.setColor(Color.WHITE)
        c.drawCircle(970f,700f,5f,p)
        p.setColor(Color.argb(150,255,255,255))
        c.drawCircle(970f,700f,9f,p)

        p.setColor(Color.WHITE)
        c.drawCircle(710f,800f,5f,p)
        p.setColor(Color.argb(150,255,255,255))
        c.drawCircle(710f,800f,9f,p)

        p.setColor(Color.WHITE)
        c.drawCircle(430f,700f,5f,p)
        p.setColor(Color.argb(150,255,255,255))
        c.drawCircle(430f,700f,9f,p)

        p.setColor(Color.WHITE)
        c.drawCircle(230f,930f,5f,p)
        p.setColor(Color.argb(150,255,255,255))
        c.drawCircle(230f,930f,9f,p)

        p.setColor(Color.WHITE)
        val grande = BitmapFactory.decodeResource(resources,R.drawable.big)
        c.drawBitmap(grande,50f,600f,p)

        //ARBOL

        p.setColor(Color.rgb(47, 42, 5))
        c.drawRect(900f,500f,1270f,1400f,p)

        p.setColor(Color.rgb(87, 35, 100))
        c.drawCircle(730f,620f,190f,p)

        p.setColor(Color.rgb(87, 35, 100))
        c.drawCircle(960f,500f,290f,p)

        p.setColor(Color.rgb(87, 35, 100))
        c.drawCircle(950f,750f,200f,p)

        //ELEMENTOS PANTEON
        val calaca = BitmapFactory.decodeResource(resources,img)
        c.drawBitmap(calaca,xC,800f,p)

        val mediana = BitmapFactory.decodeResource(resources,R.drawable.medium)
        c.drawBitmap(mediana,700f,840f,p)

        val pumpkin = BitmapFactory.decodeResource(resources,R.drawable.pumpkin)
        c.drawBitmap(pumpkin,800f,1270f,p)



        val catrina = BitmapFactory.decodeResource(resources,R.drawable.catrina)
        c.drawBitmap(catrina,1000f,1000f,p)

        val cazo = BitmapFactory.decodeResource(resources,R.drawable.cauldronbig)
        c.drawBitmap(cazo,200f, 1270f,p)
    }
}