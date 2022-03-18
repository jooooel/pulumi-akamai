# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AppSecReputationProfileActionArgs', 'AppSecReputationProfileAction']

@pulumi.input_type
class AppSecReputationProfileActionArgs:
    def __init__(__self__, *,
                 action: pulumi.Input[str],
                 config_id: pulumi.Input[int],
                 reputation_profile_id: pulumi.Input[int],
                 security_policy_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a AppSecReputationProfileAction resource.
        :param pulumi.Input[str] action: . Action taken any time the reputation profile is triggered. Allows values are:
               - **alert**. Record the event.
               - **deny**. Block the request.
               - **deny_custom_{custom_deny_id}**. Take the action specified by the custom deny.
               - **none**. Take no action.
        :param pulumi.Input[int] config_id: . Unique identifier of the security configuration associated with the reputation profile action being modified.
        :param pulumi.Input[int] reputation_profile_id: . Unique identifier of the reputation profile whose action is being modified.
        :param pulumi.Input[str] security_policy_id: . Unique identifier of the security policy associated with the reputation profile action being modified.
        """
        pulumi.set(__self__, "action", action)
        pulumi.set(__self__, "config_id", config_id)
        pulumi.set(__self__, "reputation_profile_id", reputation_profile_id)
        pulumi.set(__self__, "security_policy_id", security_policy_id)

    @property
    @pulumi.getter
    def action(self) -> pulumi.Input[str]:
        """
        . Action taken any time the reputation profile is triggered. Allows values are:
        - **alert**. Record the event.
        - **deny**. Block the request.
        - **deny_custom_{custom_deny_id}**. Take the action specified by the custom deny.
        - **none**. Take no action.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: pulumi.Input[str]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Input[int]:
        """
        . Unique identifier of the security configuration associated with the reputation profile action being modified.
        """
        return pulumi.get(self, "config_id")

    @config_id.setter
    def config_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "config_id", value)

    @property
    @pulumi.getter(name="reputationProfileId")
    def reputation_profile_id(self) -> pulumi.Input[int]:
        """
        . Unique identifier of the reputation profile whose action is being modified.
        """
        return pulumi.get(self, "reputation_profile_id")

    @reputation_profile_id.setter
    def reputation_profile_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "reputation_profile_id", value)

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> pulumi.Input[str]:
        """
        . Unique identifier of the security policy associated with the reputation profile action being modified.
        """
        return pulumi.get(self, "security_policy_id")

    @security_policy_id.setter
    def security_policy_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "security_policy_id", value)


@pulumi.input_type
class _AppSecReputationProfileActionState:
    def __init__(__self__, *,
                 action: Optional[pulumi.Input[str]] = None,
                 config_id: Optional[pulumi.Input[int]] = None,
                 reputation_profile_id: Optional[pulumi.Input[int]] = None,
                 security_policy_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AppSecReputationProfileAction resources.
        :param pulumi.Input[str] action: . Action taken any time the reputation profile is triggered. Allows values are:
               - **alert**. Record the event.
               - **deny**. Block the request.
               - **deny_custom_{custom_deny_id}**. Take the action specified by the custom deny.
               - **none**. Take no action.
        :param pulumi.Input[int] config_id: . Unique identifier of the security configuration associated with the reputation profile action being modified.
        :param pulumi.Input[int] reputation_profile_id: . Unique identifier of the reputation profile whose action is being modified.
        :param pulumi.Input[str] security_policy_id: . Unique identifier of the security policy associated with the reputation profile action being modified.
        """
        if action is not None:
            pulumi.set(__self__, "action", action)
        if config_id is not None:
            pulumi.set(__self__, "config_id", config_id)
        if reputation_profile_id is not None:
            pulumi.set(__self__, "reputation_profile_id", reputation_profile_id)
        if security_policy_id is not None:
            pulumi.set(__self__, "security_policy_id", security_policy_id)

    @property
    @pulumi.getter
    def action(self) -> Optional[pulumi.Input[str]]:
        """
        . Action taken any time the reputation profile is triggered. Allows values are:
        - **alert**. Record the event.
        - **deny**. Block the request.
        - **deny_custom_{custom_deny_id}**. Take the action specified by the custom deny.
        - **none**. Take no action.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> Optional[pulumi.Input[int]]:
        """
        . Unique identifier of the security configuration associated with the reputation profile action being modified.
        """
        return pulumi.get(self, "config_id")

    @config_id.setter
    def config_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "config_id", value)

    @property
    @pulumi.getter(name="reputationProfileId")
    def reputation_profile_id(self) -> Optional[pulumi.Input[int]]:
        """
        . Unique identifier of the reputation profile whose action is being modified.
        """
        return pulumi.get(self, "reputation_profile_id")

    @reputation_profile_id.setter
    def reputation_profile_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "reputation_profile_id", value)

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> Optional[pulumi.Input[str]]:
        """
        . Unique identifier of the security policy associated with the reputation profile action being modified.
        """
        return pulumi.get(self, "security_policy_id")

    @security_policy_id.setter
    def security_policy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "security_policy_id", value)


class AppSecReputationProfileAction(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 config_id: Optional[pulumi.Input[int]] = None,
                 reputation_profile_id: Optional[pulumi.Input[int]] = None,
                 security_policy_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        **Scopes**: Reputation profile

        Modifies the action taken when a reputation profile is triggered.

        **Related API Endpoint**: [/appsec/v1/configs/{configId}/versions/{versionNumber}/security-policies/{policyId}/reputation-profiles/{reputationProfileId}](https://developer.akamai.com/api/cloud_security/application_security/v1.html#putreputationprofileaction)

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_akamai as akamai

        configuration = akamai.get_app_sec_configuration(name="Documentation")
        appsec_reputation_profile_action = akamai.AppSecReputationProfileAction("appsecReputationProfileAction",
            config_id=configuration.config_id,
            security_policy_id="gms1_134637",
            reputation_profile_id=130713,
            action="alert")
        pulumi.export("reputationProfileId", appsec_reputation_profile_action.reputation_profile_id)
        pulumi.export("reputationProfileAction", appsec_reputation_profile_action.action)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action: . Action taken any time the reputation profile is triggered. Allows values are:
               - **alert**. Record the event.
               - **deny**. Block the request.
               - **deny_custom_{custom_deny_id}**. Take the action specified by the custom deny.
               - **none**. Take no action.
        :param pulumi.Input[int] config_id: . Unique identifier of the security configuration associated with the reputation profile action being modified.
        :param pulumi.Input[int] reputation_profile_id: . Unique identifier of the reputation profile whose action is being modified.
        :param pulumi.Input[str] security_policy_id: . Unique identifier of the security policy associated with the reputation profile action being modified.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppSecReputationProfileActionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        **Scopes**: Reputation profile

        Modifies the action taken when a reputation profile is triggered.

        **Related API Endpoint**: [/appsec/v1/configs/{configId}/versions/{versionNumber}/security-policies/{policyId}/reputation-profiles/{reputationProfileId}](https://developer.akamai.com/api/cloud_security/application_security/v1.html#putreputationprofileaction)

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_akamai as akamai

        configuration = akamai.get_app_sec_configuration(name="Documentation")
        appsec_reputation_profile_action = akamai.AppSecReputationProfileAction("appsecReputationProfileAction",
            config_id=configuration.config_id,
            security_policy_id="gms1_134637",
            reputation_profile_id=130713,
            action="alert")
        pulumi.export("reputationProfileId", appsec_reputation_profile_action.reputation_profile_id)
        pulumi.export("reputationProfileAction", appsec_reputation_profile_action.action)
        ```

        :param str resource_name: The name of the resource.
        :param AppSecReputationProfileActionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppSecReputationProfileActionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 config_id: Optional[pulumi.Input[int]] = None,
                 reputation_profile_id: Optional[pulumi.Input[int]] = None,
                 security_policy_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppSecReputationProfileActionArgs.__new__(AppSecReputationProfileActionArgs)

            if action is None and not opts.urn:
                raise TypeError("Missing required property 'action'")
            __props__.__dict__["action"] = action
            if config_id is None and not opts.urn:
                raise TypeError("Missing required property 'config_id'")
            __props__.__dict__["config_id"] = config_id
            if reputation_profile_id is None and not opts.urn:
                raise TypeError("Missing required property 'reputation_profile_id'")
            __props__.__dict__["reputation_profile_id"] = reputation_profile_id
            if security_policy_id is None and not opts.urn:
                raise TypeError("Missing required property 'security_policy_id'")
            __props__.__dict__["security_policy_id"] = security_policy_id
        super(AppSecReputationProfileAction, __self__).__init__(
            'akamai:index/appSecReputationProfileAction:AppSecReputationProfileAction',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            action: Optional[pulumi.Input[str]] = None,
            config_id: Optional[pulumi.Input[int]] = None,
            reputation_profile_id: Optional[pulumi.Input[int]] = None,
            security_policy_id: Optional[pulumi.Input[str]] = None) -> 'AppSecReputationProfileAction':
        """
        Get an existing AppSecReputationProfileAction resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action: . Action taken any time the reputation profile is triggered. Allows values are:
               - **alert**. Record the event.
               - **deny**. Block the request.
               - **deny_custom_{custom_deny_id}**. Take the action specified by the custom deny.
               - **none**. Take no action.
        :param pulumi.Input[int] config_id: . Unique identifier of the security configuration associated with the reputation profile action being modified.
        :param pulumi.Input[int] reputation_profile_id: . Unique identifier of the reputation profile whose action is being modified.
        :param pulumi.Input[str] security_policy_id: . Unique identifier of the security policy associated with the reputation profile action being modified.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppSecReputationProfileActionState.__new__(_AppSecReputationProfileActionState)

        __props__.__dict__["action"] = action
        __props__.__dict__["config_id"] = config_id
        __props__.__dict__["reputation_profile_id"] = reputation_profile_id
        __props__.__dict__["security_policy_id"] = security_policy_id
        return AppSecReputationProfileAction(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def action(self) -> pulumi.Output[str]:
        """
        . Action taken any time the reputation profile is triggered. Allows values are:
        - **alert**. Record the event.
        - **deny**. Block the request.
        - **deny_custom_{custom_deny_id}**. Take the action specified by the custom deny.
        - **none**. Take no action.
        """
        return pulumi.get(self, "action")

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Output[int]:
        """
        . Unique identifier of the security configuration associated with the reputation profile action being modified.
        """
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter(name="reputationProfileId")
    def reputation_profile_id(self) -> pulumi.Output[int]:
        """
        . Unique identifier of the reputation profile whose action is being modified.
        """
        return pulumi.get(self, "reputation_profile_id")

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> pulumi.Output[str]:
        """
        . Unique identifier of the security policy associated with the reputation profile action being modified.
        """
        return pulumi.get(self, "security_policy_id")
