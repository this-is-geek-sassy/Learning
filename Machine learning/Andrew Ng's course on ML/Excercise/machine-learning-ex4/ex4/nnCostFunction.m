function [J grad] = nnCostFunction(nn_params, ...
                                   input_layer_size, ...
                                   hidden_layer_size, ...
                                   num_labels, ...
                                   X, y, lambda)
%NNCOSTFUNCTION Implements the neural network cost function for a two layer
%neural network which performs classification
%   [J grad] = NNCOSTFUNCTON(nn_params, hidden_layer_size, num_labels, ...
%   X, y, lambda) computes the cost and gradient of the neural network. The
%   parameters for the neural network are "unrolled" into the vector
%   nn_params and need to be converted back into the weight matrices. 
% 
%   The returned parameter grad should be a "unrolled" vector of the
%   partial derivatives of the neural network.
%

% Reshape nn_params back into the parameters Theta1 and Theta2, the weight matrices
% for our 2 layer neural network
Theta1 = reshape(nn_params(1:hidden_layer_size * (input_layer_size + 1)), ...
                 hidden_layer_size, (input_layer_size + 1));

Theta2 = reshape(nn_params((1 + (hidden_layer_size * (input_layer_size + 1))):end), ...
                 num_labels, (hidden_layer_size + 1));

% Setup some useful variables
m = size(X, 1);
         
% You need to return the following variables correctly 
J = 0;
Theta1_grad = zeros(size(Theta1));
Theta2_grad = zeros(size(Theta2));

% ====================== YOUR CODE HERE ======================
% Instructions: You should complete the code by working through the
%               following parts.
%
% Part 1: Feedforward the neural network and return the cost in the
%         variable J. After implementing Part 1, you can verify that your
%         cost function computation is correct by verifying the cost
%         computed in ex4.m
%
% Part 2: Implement the backpropagation algorithm to compute the gradients
%         Theta1_grad and Theta2_grad. You should return the partial derivatives of
%         the cost function with respect to Theta1 and Theta2 in Theta1_grad and
%         Theta2_grad, respectively. After implementing Part 2, you can check
%         that your implementation is correct by running checkNNGradients
%
%         Note: The vector y passed into the function is a vector of labels
%               containing values from 1..K. You need to map this vector into a 
%               binary vector of 1's and 0's to be used with the neural network
%               cost function.
%
%         Hint: We recommend implementing backpropagation using a for-loop
%               over the training examples if you are implementing it for the 
%               first time.
%
% Part 3: Implement regularization with the cost function and gradients.
%
%         Hint: You can implement this around the code for
%               backpropagation. That is, you can compute the gradients for
%               the regularization separately and then add them to Theta1_grad
%               and Theta2_grad from Part 2.
%

%n = size(y,1);
Y = zeros(num_labels, m);
for i=1:m
  k = zeros(num_labels, 1);
  k(y(i)) = 1;
  Y(:,i) = k;
endfor
%y = Y;
%j = zeros(m,1);
Del_1 = zeros(size(Theta1));
Del_2 = zeros(size(Theta2));
for i=1:m
  a1 = X(i,:);
  a1 = [1;a1(:)];
  z2 = Theta1*a1;
  a2 = sigmoid(z2);
  a2 = [1;a2(:)];
  z3 = Theta2*a2;
  a3 = sigmoid(z3);
  % forwrd propagation
  % -----
  % Cost calculation
  h = a3;
  temp1 = (Y(:,i));
  temp1 = temp1.*log(h);
  temp2 = (1 - Y(:,i));
  temp2 = temp2.*log(1-h);
  temp = -temp1 - temp2;
  j(i, :) = sum(temp);
  % cost calculation
  % -----
  % backpropagation
  d3 = a3 - Y(:,i);
  %d3(1) = 0;
  d2 = (Theta2' * d3) .* sigmoidGradient([1;z2]);
  %d2(1) = 0;
  Del_2 = Del_2 + d3*a2';
  Del_1 = Del_1 + d2(2:end)*a1';
  % backpropagation
  % -----
endfor

J = sum(j)/m;

A = sum((Theta1(:, 2:end).^2));
a = sum(A);
B = sum((Theta2(:, 2:end).^2));
b = sum(B);
reg = (lambda/(2*m))*(a+b);

J = J+reg;

% -------------------------------------------------------------
Theta1_grad(:,1) = Del_1(:,1)/m;
Theta1_grad(:,2:end) = Del_1(:,2:end)/m + Theta1(:,2:end)*(lambda/m);

Theta2_grad(:,1) = Del_2(:,1)/m;
Theta2_grad(:,2:end) = Del_2(:,2:end)/m + Theta2(:,2:end)*(lambda/m);
% =========================================================================

% Unroll gradients
grad = [Theta1_grad(:) ; Theta2_grad(:)];


end
