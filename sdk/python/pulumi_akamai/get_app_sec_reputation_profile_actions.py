# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetAppSecReputationProfileActionsResult',
    'AwaitableGetAppSecReputationProfileActionsResult',
    'get_app_sec_reputation_profile_actions',
    'get_app_sec_reputation_profile_actions_output',
]

@pulumi.output_type
class GetAppSecReputationProfileActionsResult:
    """
    A collection of values returned by getAppSecReputationProfileActions.
    """
    def __init__(__self__, action=None, config_id=None, id=None, json=None, output_text=None, reputation_profile_id=None, security_policy_id=None):
        if action and not isinstance(action, str):
            raise TypeError("Expected argument 'action' to be a str")
        pulumi.set(__self__, "action", action)
        if config_id and not isinstance(config_id, int):
            raise TypeError("Expected argument 'config_id' to be a int")
        pulumi.set(__self__, "config_id", config_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if json and not isinstance(json, str):
            raise TypeError("Expected argument 'json' to be a str")
        pulumi.set(__self__, "json", json)
        if output_text and not isinstance(output_text, str):
            raise TypeError("Expected argument 'output_text' to be a str")
        pulumi.set(__self__, "output_text", output_text)
        if reputation_profile_id and not isinstance(reputation_profile_id, int):
            raise TypeError("Expected argument 'reputation_profile_id' to be a int")
        pulumi.set(__self__, "reputation_profile_id", reputation_profile_id)
        if security_policy_id and not isinstance(security_policy_id, str):
            raise TypeError("Expected argument 'security_policy_id' to be a str")
        pulumi.set(__self__, "security_policy_id", security_policy_id)

    @property
    @pulumi.getter
    def action(self) -> str:
        return pulumi.get(self, "action")

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> int:
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def json(self) -> str:
        return pulumi.get(self, "json")

    @property
    @pulumi.getter(name="outputText")
    def output_text(self) -> str:
        return pulumi.get(self, "output_text")

    @property
    @pulumi.getter(name="reputationProfileId")
    def reputation_profile_id(self) -> Optional[int]:
        return pulumi.get(self, "reputation_profile_id")

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> str:
        return pulumi.get(self, "security_policy_id")


class AwaitableGetAppSecReputationProfileActionsResult(GetAppSecReputationProfileActionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppSecReputationProfileActionsResult(
            action=self.action,
            config_id=self.config_id,
            id=self.id,
            json=self.json,
            output_text=self.output_text,
            reputation_profile_id=self.reputation_profile_id,
            security_policy_id=self.security_policy_id)


def get_app_sec_reputation_profile_actions(config_id: Optional[int] = None,
                                           reputation_profile_id: Optional[int] = None,
                                           security_policy_id: Optional[str] = None,
                                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppSecReputationProfileActionsResult:
    """
    ## get_app_sec_reputation_profile_actions

    **Scopes**: Security policy; reputation profile

    Returns action information for your reputation profiles. Actions specify what happens any time a profile is triggered: the issue could be ignored, the request could be denied, or an alert could be generated.

    **Related API Endpoint**: [/appsec/v1/configs/{configId}/versions/{versionNumber}/security-policies/{policyId}/reputation-profiles](https://developer.akamai.com/api/cloud_security/application_security/v1.html#getreputationprofileactions)

    ## Example Usage

    Basic usage:

    ```python
    import pulumi
    import pulumi_akamai as akamai

    configuration = akamai.get_app_sec_configuration(name="Documentation")
    reputation_profile_actions = akamai.get_app_sec_reputation_profile_actions(config_id=configuration.config_id,
        security_policy_id="gms1_134637")
    pulumi.export("reputationProfileActionsText", reputation_profile_actions.output_text)
    pulumi.export("reputationProfileActionsJson", reputation_profile_actions.json)
    reputation_profile_actions2_app_sec_reputation_profile_actions = akamai.get_app_sec_reputation_profile_actions(config_id=configuration.config_id,
        security_policy_id="gms1_134637",
        reputation_profile_id=12345)
    pulumi.export("reputationProfileActions2", reputation_profile_actions.action)
    ```
    ## Output Options

    The following options can be used to determine the information returned, and how that returned information is formatted:

    - `action`. Action taken any time the reputation profile is triggered. Valid values are:
      - **alert**. Record the event.
      - **deny**. Block the request.
      - **deny_custom_{custom_deny_id}**. The action defined by the custom deny is taken.
      - **none**. Take no action.
    - `json`. JSON-formatted report of the reputation profile action information.
    - `output_text`. Tabular report of the reputation profile action information.


    :param int config_id: . Unique identifier of the security configuration associated with the reputation profiles.
    :param int reputation_profile_id: . Unique identifier of the reputation profile you want to return information for. If not included, information is returned for all your reputation profiles.
    :param str security_policy_id: . Unique identifier of the security policy associated with the reputation profiles.
    """
    __args__ = dict()
    __args__['configId'] = config_id
    __args__['reputationProfileId'] = reputation_profile_id
    __args__['securityPolicyId'] = security_policy_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('akamai:index/getAppSecReputationProfileActions:getAppSecReputationProfileActions', __args__, opts=opts, typ=GetAppSecReputationProfileActionsResult).value

    return AwaitableGetAppSecReputationProfileActionsResult(
        action=__ret__.action,
        config_id=__ret__.config_id,
        id=__ret__.id,
        json=__ret__.json,
        output_text=__ret__.output_text,
        reputation_profile_id=__ret__.reputation_profile_id,
        security_policy_id=__ret__.security_policy_id)


@_utilities.lift_output_func(get_app_sec_reputation_profile_actions)
def get_app_sec_reputation_profile_actions_output(config_id: Optional[pulumi.Input[int]] = None,
                                                  reputation_profile_id: Optional[pulumi.Input[Optional[int]]] = None,
                                                  security_policy_id: Optional[pulumi.Input[str]] = None,
                                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAppSecReputationProfileActionsResult]:
    """
    ## get_app_sec_reputation_profile_actions

    **Scopes**: Security policy; reputation profile

    Returns action information for your reputation profiles. Actions specify what happens any time a profile is triggered: the issue could be ignored, the request could be denied, or an alert could be generated.

    **Related API Endpoint**: [/appsec/v1/configs/{configId}/versions/{versionNumber}/security-policies/{policyId}/reputation-profiles](https://developer.akamai.com/api/cloud_security/application_security/v1.html#getreputationprofileactions)

    ## Example Usage

    Basic usage:

    ```python
    import pulumi
    import pulumi_akamai as akamai

    configuration = akamai.get_app_sec_configuration(name="Documentation")
    reputation_profile_actions = akamai.get_app_sec_reputation_profile_actions(config_id=configuration.config_id,
        security_policy_id="gms1_134637")
    pulumi.export("reputationProfileActionsText", reputation_profile_actions.output_text)
    pulumi.export("reputationProfileActionsJson", reputation_profile_actions.json)
    reputation_profile_actions2_app_sec_reputation_profile_actions = akamai.get_app_sec_reputation_profile_actions(config_id=configuration.config_id,
        security_policy_id="gms1_134637",
        reputation_profile_id=12345)
    pulumi.export("reputationProfileActions2", reputation_profile_actions.action)
    ```
    ## Output Options

    The following options can be used to determine the information returned, and how that returned information is formatted:

    - `action`. Action taken any time the reputation profile is triggered. Valid values are:
      - **alert**. Record the event.
      - **deny**. Block the request.
      - **deny_custom_{custom_deny_id}**. The action defined by the custom deny is taken.
      - **none**. Take no action.
    - `json`. JSON-formatted report of the reputation profile action information.
    - `output_text`. Tabular report of the reputation profile action information.


    :param int config_id: . Unique identifier of the security configuration associated with the reputation profiles.
    :param int reputation_profile_id: . Unique identifier of the reputation profile you want to return information for. If not included, information is returned for all your reputation profiles.
    :param str security_policy_id: . Unique identifier of the security policy associated with the reputation profiles.
    """
    ...