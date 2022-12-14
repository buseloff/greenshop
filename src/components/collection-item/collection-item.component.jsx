import React from 'react';
import { connect } from 'react-redux';
import CustomButton from '../custom-button/custom-button.component';
import { addItem } from '../../redux/cart/cart.actions';
import * as Img from '../../assets/img/images';
import './collection-item.styles.scss';


const CollectionItem = ({ item, addItem }) => {
  const { name, price } = item; //imageUrl


  return (
    <div className='collection-item'>
      <div
        className='image'
        style={{
          backgroundImage: `url(${Img[name]})`
        }}
      />

      <div className='collection-footer'>
        <span className='name'>{name}</span>
        <span className='price'>${price}</span>
      </div>
      <CustomButton onClick={() => addItem(item)} inverted>
        Add to cart
      </CustomButton>
    </div>
  );
};

const mapDispatchToProps = dispatch => ({
  addItem: item => dispatch(addItem(item))
});

export default connect(
  null,
  mapDispatchToProps
)(CollectionItem);
