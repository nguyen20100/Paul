/ * *  
   *   C o d e   g � n � r �   p a r   W i n D e v   M o b i l e   -   N E   P A S   M O D I F I E R   !  
   *   O b j e t   W i n D e v   M o b i l e   :   S p l a s h   S c r e e n  
   *   C l a s s e   A n d r o i d   :   P r o j e t D o m o t i q u e  
   *   D a t e   :   2 9 / 0 1 / 2 0 1 6   0 9 : 0 2 : 0 2  
   *   V e r s i o n   d e   w d j a v a . d l l     :   1 9 . 0 . 1 4 2 . 0  
   * /  
  
  
 p a c k a g e   c o m . m a s o c i e t e . p r o j e t d o m o t i q u e . w d g e n ;  
  
  
 i m p o r t   c o m . m a s o c i e t e . p r o j e t d o m o t i q u e . * ;  
 i m p o r t   f r . p c s o f t . w d j a v a . c o r e . t y p e s . * ;  
 i m p o r t   f r . p c s o f t . w d j a v a . c o r e . * ;  
 i m p o r t   f r . p c s o f t . w d j a v a . c o r e . a p p l i c a t i o n . * ;  
 i m p o r t   f r . p c s o f t . w d j a v a . u i . s t y l e . d e g r a d e . * ;  
 / * I m p o r t s   t r o u v � s   d a n s   l e   c o d e   W L * /  
 / * F i n   I m p o r t s   t r o u v � s   d a n s   l e   c o d e   W L * /  
  
  
  
 p u b l i c   c l a s s   W D S p l a s h S c r e e n G e n   i m p l e m e n t s   I W D S p l a s h S c r e e n  
 {  
 p u b l i c   i n t   g e t I d I m a g e F o n d ( ) { r e t u r n   0 ; }  
 p u b l i c   i n t   g e t I d N o m A p p l i c a t i o n ( ) { r e t u r n   R . s t r i n g . s p l a s h s c r e e n _ t i t l e ; }  
 p u b l i c   i n t   g e t I d I n f o V e r s i o n ( ) { r e t u r n   R . s t r i n g . s p l a s h s c r e e n _ v e r s i o n ; }  
 p u b l i c   i n t   g e t I d L o g o ( ) { r e t u r n   0 ; }  
 p u b l i c   b o o l e a n   i s A v e c A n i m a t i o n C h a r g e m e n t ( ) { r e t u r n   t r u e ; }  
 p u b l i c   i n t   g e t I d M e s s a g e C h a r g e m e n t ( ) { r e t u r n   R . s t r i n g . s p l a s h s c r e e n _ m e s s a g e ; }  
 p u b l i c   i n t   g e t C o u l e u r L i b e l l e ( ) { r e t u r n   0 x 6 5 6 5 6 5 ; }  
 p u b l i c   i n t   g e t C o u l e u r F o n d ( ) { r e t u r n   0 ; }  
 p u b l i c   I W D D e g r a d e   g e t F o n d D e g r a d e ( ) { r e t u r n   W D D e g r a d e F a c t o r y . c r e e r D e g r a d e _ G E N ( n e w   i n t [ ] { 0 x B 4 B 4 B 4 ,   0 x F F F F F F ,   0 x B 4 B 4 B 4 } ,   9 0 ,   n e w   i n t [ ] { 5 0 } ) ; }  
 }  
 