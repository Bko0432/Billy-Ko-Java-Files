
public class Logic {

public Logic(){
	
}
public double Velocity(double d, double t){
	return d/t;
	
}
public double Displacement(double v, double t){
	return v*t;
}
public double Time(double d, double v){
	return d/v;
}
public double FinalVelocity(double u, double a, double t){
	return u + a*t;
	
}
public double InitialVelocity(double v, double a , double t){
	return v - a*t;
}
public double Acceleration(double v, double u, double t){
	return (v-u) /t;
	
}
public double Time(double v, double u, double a){
	return (v-u) /a;
}
public double FinalVelocitySquared(double u, double a, double s){
	return (Math.pow(u,2)+2*a*s);
}
public double InitialVelocitySquared(double v, double a, double s){
	return (Math.pow(v,2)-2*a*s);
}
public double AccelerationSquared(double v, double u, double s){
	return ((Math.pow(v,2)-Math.pow(u,2))/2*s);
}
public double DisplacementSquared(double v, double u, double a) {
	return ((Math.pow(v,2)-Math.pow(u,2))/2*a);
}
public double Displacement3rd(double v, double u, double t){
	return ((v+u)/2)*t;
}
public double FinalVelocity3rd(double s, double u, double t){
	return 2*s/t - u;
}
public double InitialVelocity3rd(double s, double v, double t){
	return 2*s/t - v;
}
public double Time3rd(double s, double v, double u){
	return s/((v+u)/2);
}
public double Displacement4th(double u, double t, double a){
	return (u*t+a*Math.pow(t,2)/2);
}
public double InitialVelocity4th(double s, double a, double t){
	return ((s - (a*Math.pow(t,2)/2))/t);
	
}
public double Acceleration4th(double s, double u, double t){
	return (2*(s - u*t)/Math.pow(t,2));
}
public double Time4th(double s, double a){
	return Math.sqrt(2*s/a);
}

// ForcePower
public double Force(double m, double a){
	return m*a;
}
public double Mass(double f, double a){
	return f/a;
}
public double Acceleration(double f, double m){
	return f/m;
}
public double Work(double f, double d){
	return f*d;
}
public double Force5th(double w, double d){
	return w/d;
}
public double Displacement5th(double w, double f){
	return w/f;
}
public double Power(double w, double t){
	return w/t;
}
public double Work2nd(double P, double t){
	return P*t;
}
public double Time5th(double w, double P){
	return w/P;
}
//Acceleration
public double Acceleration2nd(double f, double m){
	return f/m;
}
public double Force6th(double m, double a){
	return m*a;
}
public double Mass2nd(double f, double a){
	return f/a;
}
public double Acceleration3rd(double v, double u, double t){
	return v-u/t;
}
public double FinalVelocity5th (double u, double t, double a){
	return u+a*t;
}
public double InitialVelocity5th(double a, double t, double v){
	return (((-1*a)*t)+v);
}
public double Time6th(double a, double v, double u){
	return v-u/a;
}
}
