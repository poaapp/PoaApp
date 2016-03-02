/*
 * Copyright (C) 2015-2016 Actor LLC. <https://actor.im>
 */

import { ActorSDK, ActorSDKDelegate } from 'actor-sdk';

const components = {};
const actions = {};
const l18n = {};

const options = {
  endpoints: [
    'wss://front1-ws-mtproto-api-rev2.actor.im',
    'wss://front2-ws-mtproto-api-rev2.actor.im'
  ],
  delegate: new ActorSDKDelegate(components, actions, l18n)
};

const app = new ActorSDK(options);

app.startApp();
