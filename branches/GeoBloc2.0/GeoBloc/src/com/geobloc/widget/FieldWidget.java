package com.geobloc.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.geobloc.activities.FormActivity;
import com.geobloc.prompt.DataInputQuestionPrompt;
import com.geobloc.prompt.LabelQuestionPrompt;
import com.geobloc.prompt.QuestionPrompt;
import com.geobloc.shared.Utilities;
import com.geobloc.shared.Utilities.WidgetType;

public class FieldWidget extends LinearLayout implements IQuestionWidget {
	
	TextView Text;
	EditText ed;
	DataInputQuestionPrompt qP;
	
	public FieldWidget(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public FieldWidget(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buildView(QuestionPrompt qP) {
		// TODO Auto-generated method stub
		this.qP = (DataInputQuestionPrompt) qP;
		
        /* Contendr� el Texto y el EditText */
        /* Texto antes del EditText */
        Text = new TextView(getContext());
        Text.setTextSize(20);
        Text.setText(((DataInputQuestionPrompt)qP).getQuestionTitle()+":  ");
        Text.setLayoutParams (new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT, 3));
        
        ed = new EditText(getContext());
        ed.setLayoutParams (new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT, 2));
        ed.setText(((DataInputQuestionPrompt)qP).getQuestionInput());
        
        
        int numLines = ((DataInputQuestionPrompt)qP).getNumLines();
        if (numLines > 1) {
        	this.setOrientation(LinearLayout.VERTICAL);
        }
        ed.setLines(numLines);
        ed.setMaxLines(numLines);     
        
        switch (((DataInputQuestionPrompt)qP).getFieldType()) {
        case INT:
        	ed.setInputType(InputType.TYPE_CLASS_NUMBER);
        	break;
        case FLOAT:
        	ed.setInputType(InputType.TYPE_CLASS_NUMBER|InputType.TYPE_NUMBER_FLAG_DECIMAL);
        	break;
        default:
        	if (numLines == 1) {
        		ed.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_NORMAL);
        	} else {
        		ed.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_NORMAL|InputType.TYPE_TEXT_FLAG_MULTI_LINE);
        	}
        	break;
        }
        
        addView(Text);
        addView(ed);
        
		if (qP.isRequired()) {
			this.setBackgroundColor(Utilities.requiredColor);
		}
		
		/**
		 * NOTA: Si le a�adimos el listener a todas las vistas funcionar�a el "OnFlin"
		 */
		//ed.setOnTouchListener(FormActivity.gestureListener);

	}

	@Override
	public void clearAnswer() {
		// TODO Auto-generated method stub
		((EditText)this.getChildAt(1)).setText("");
	}
	
	@Override
	public Object getAnswer () {
		return ed.getText().toString();
	}
	
	@Override
	public void mySetListener(OnTouchListener list) {
		ed.setOnTouchListener(list);
		Text.setOnTouchListener(list);
	}

	@Override
	public WidgetType getType() {
		return WidgetType.FIELD;
	}
	
}
