import React from 'react';
import * as Img from '../../assets/img/images';
import './cart-item.styles.scss';

const CartItem = ({ item: { price, name, quantity } }) => (
  <div className='cart-item'>
    <img src={Img[name]} alt='item' />
    <div className='item-details'>
      <span className='name'>{name}</span>
      <span className='price'>
        {quantity} x ${price}
      </span>
    </div>
  </div>
);
//imageUrl
export default CartItem;
