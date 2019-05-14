package fi.vamk.sumcalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }




    fun buttonClicked(view: View?)  {
       // infoView.text=(Integer.parseInt(numText1.getText().toString()) + Integer.parseInt(numText2.getText().toString())).toString()

        if(numText1.getText().toString() == "" || numText2.getText().toString() == ""){
            resultTextView.text="Error!"
        }else{
            var num1=Integer.parseInt(numText1.getText().toString())
            var num2=Integer.parseInt(numText2.getText().toString())
            var sum = num1+num2
            resultTextView.text=sum.toString()
        }
        /*
        var num1=Integer.parseInt(numText1.getText().toString())
        var num2=Integer.parseInt(numText2.getText().toString())
       if(num1 !is Number || num2 !is Number){
           var sum = num1+num2
           resultTextView.text=sum.toString()
       }
*/


    }
}





