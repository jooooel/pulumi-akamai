# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['CloudletsPolicyArgs', 'CloudletsPolicy']

@pulumi.input_type
class CloudletsPolicyArgs:
    def __init__(__self__, *,
                 cloudlet_code: pulumi.Input[str],
                 group_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 match_rule_format: Optional[pulumi.Input[str]] = None,
                 match_rules: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a CloudletsPolicy resource.
        :param pulumi.Input[str] cloudlet_code: The two- or three- character code for the type of Cloudlet, either `ALB` for Application Load Balancer or `ER` for Edge Redirector.
        :param pulumi.Input[str] group_id: Defines the group association for the policy. You must have edit privileges for the group.
        :param pulumi.Input[str] description: The description of this specific policy.
        :param pulumi.Input[str] match_rule_format: The version of the Cloudlet-specific `match_rules`.
        :param pulumi.Input[str] match_rules: A JSON structure that defines the rules for this policy
        :param pulumi.Input[str] name: The unique name of the policy.
        """
        pulumi.set(__self__, "cloudlet_code", cloudlet_code)
        pulumi.set(__self__, "group_id", group_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if match_rule_format is not None:
            pulumi.set(__self__, "match_rule_format", match_rule_format)
        if match_rules is not None:
            pulumi.set(__self__, "match_rules", match_rules)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="cloudletCode")
    def cloudlet_code(self) -> pulumi.Input[str]:
        """
        The two- or three- character code for the type of Cloudlet, either `ALB` for Application Load Balancer or `ER` for Edge Redirector.
        """
        return pulumi.get(self, "cloudlet_code")

    @cloudlet_code.setter
    def cloudlet_code(self, value: pulumi.Input[str]):
        pulumi.set(self, "cloudlet_code", value)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Input[str]:
        """
        Defines the group association for the policy. You must have edit privileges for the group.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of this specific policy.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="matchRuleFormat")
    def match_rule_format(self) -> Optional[pulumi.Input[str]]:
        """
        The version of the Cloudlet-specific `match_rules`.
        """
        return pulumi.get(self, "match_rule_format")

    @match_rule_format.setter
    def match_rule_format(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "match_rule_format", value)

    @property
    @pulumi.getter(name="matchRules")
    def match_rules(self) -> Optional[pulumi.Input[str]]:
        """
        A JSON structure that defines the rules for this policy
        """
        return pulumi.get(self, "match_rules")

    @match_rules.setter
    def match_rules(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "match_rules", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The unique name of the policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _CloudletsPolicyState:
    def __init__(__self__, *,
                 cloudlet_code: Optional[pulumi.Input[str]] = None,
                 cloudlet_id: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 match_rule_format: Optional[pulumi.Input[str]] = None,
                 match_rules: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[int]] = None,
                 warnings: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CloudletsPolicy resources.
        :param pulumi.Input[str] cloudlet_code: The two- or three- character code for the type of Cloudlet, either `ALB` for Application Load Balancer or `ER` for Edge Redirector.
        :param pulumi.Input[int] cloudlet_id: A unique identifier that corresponds to a Cloudlets policy type, either `0` for Edge Redirector or `9` for Application Load Balancer.
        :param pulumi.Input[str] description: The description of this specific policy.
        :param pulumi.Input[str] group_id: Defines the group association for the policy. You must have edit privileges for the group.
        :param pulumi.Input[str] match_rule_format: The version of the Cloudlet-specific `match_rules`.
        :param pulumi.Input[str] match_rules: A JSON structure that defines the rules for this policy
        :param pulumi.Input[str] name: The unique name of the policy.
        :param pulumi.Input[int] version: The version number of the policy.
        :param pulumi.Input[str] warnings: A JSON-encoded list of warnings.
        """
        if cloudlet_code is not None:
            pulumi.set(__self__, "cloudlet_code", cloudlet_code)
        if cloudlet_id is not None:
            pulumi.set(__self__, "cloudlet_id", cloudlet_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if group_id is not None:
            pulumi.set(__self__, "group_id", group_id)
        if match_rule_format is not None:
            pulumi.set(__self__, "match_rule_format", match_rule_format)
        if match_rules is not None:
            pulumi.set(__self__, "match_rules", match_rules)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if version is not None:
            pulumi.set(__self__, "version", version)
        if warnings is not None:
            pulumi.set(__self__, "warnings", warnings)

    @property
    @pulumi.getter(name="cloudletCode")
    def cloudlet_code(self) -> Optional[pulumi.Input[str]]:
        """
        The two- or three- character code for the type of Cloudlet, either `ALB` for Application Load Balancer or `ER` for Edge Redirector.
        """
        return pulumi.get(self, "cloudlet_code")

    @cloudlet_code.setter
    def cloudlet_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cloudlet_code", value)

    @property
    @pulumi.getter(name="cloudletId")
    def cloudlet_id(self) -> Optional[pulumi.Input[int]]:
        """
        A unique identifier that corresponds to a Cloudlets policy type, either `0` for Edge Redirector or `9` for Application Load Balancer.
        """
        return pulumi.get(self, "cloudlet_id")

    @cloudlet_id.setter
    def cloudlet_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "cloudlet_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of this specific policy.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> Optional[pulumi.Input[str]]:
        """
        Defines the group association for the policy. You must have edit privileges for the group.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter(name="matchRuleFormat")
    def match_rule_format(self) -> Optional[pulumi.Input[str]]:
        """
        The version of the Cloudlet-specific `match_rules`.
        """
        return pulumi.get(self, "match_rule_format")

    @match_rule_format.setter
    def match_rule_format(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "match_rule_format", value)

    @property
    @pulumi.getter(name="matchRules")
    def match_rules(self) -> Optional[pulumi.Input[str]]:
        """
        A JSON structure that defines the rules for this policy
        """
        return pulumi.get(self, "match_rules")

    @match_rules.setter
    def match_rules(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "match_rules", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The unique name of the policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[int]]:
        """
        The version number of the policy.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "version", value)

    @property
    @pulumi.getter
    def warnings(self) -> Optional[pulumi.Input[str]]:
        """
        A JSON-encoded list of warnings.
        """
        return pulumi.get(self, "warnings")

    @warnings.setter
    def warnings(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "warnings", value)


class CloudletsPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cloudlet_code: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 match_rule_format: Optional[pulumi.Input[str]] = None,
                 match_rules: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Use the `CloudletsPolicy` resource to create and version a policy. For each Cloudlet instance on your contract, there can be any number of policies. A single policy is associated with a single property configuration. Within a policy version you define the rules that determine when the Cloudlet executes. You may want to create a new version of a policy to support a different business requirement, or to test new functionality.

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_akamai as akamai

        example = akamai.CloudletsPolicy("example",
            cloudlet_code="ER",
            description="policy description",
            group_id="grp_123",
            match_rules=\"\"\"  [
          {
            "name": "rule1",
            "type": "erMatchRule",
            "useRelativeUrl": "none",
            "statusCode": 301,
            "redirectURL": "https://www.example.com",
            "matchURL": "example.com",
            "useIncomingQueryString": false,
            "useIncomingSchemeAndHost": true
          },
          {
            "name": "rule2",
            "type": "erMatchRule",
            "matches": [
              {
                "matchType": "hostname",
                "matchValue": "3333.dom",
                "matchOperator": "equals",
                "caseSensitive": true,
                "negate": false
              }
            ],
            "useRelativeUrl": "none",
            "statusCode": 301,
            "redirectURL": "https://www.example.com",
            "useIncomingQueryString": false,
            "useIncomingSchemeAndHost": true
          }
        ]
        \"\"\")
        ```

        ## Import

        Basic usagehcl resource "akamai_cloudlets_policy" "example" {

        # (resource arguments)

         } You can import your Akamai Cloudlets policy using a policy name. For example

        ```sh
         $ pulumi import akamai:index/cloudletsPolicy:CloudletsPolicy example policy1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cloudlet_code: The two- or three- character code for the type of Cloudlet, either `ALB` for Application Load Balancer or `ER` for Edge Redirector.
        :param pulumi.Input[str] description: The description of this specific policy.
        :param pulumi.Input[str] group_id: Defines the group association for the policy. You must have edit privileges for the group.
        :param pulumi.Input[str] match_rule_format: The version of the Cloudlet-specific `match_rules`.
        :param pulumi.Input[str] match_rules: A JSON structure that defines the rules for this policy
        :param pulumi.Input[str] name: The unique name of the policy.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CloudletsPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use the `CloudletsPolicy` resource to create and version a policy. For each Cloudlet instance on your contract, there can be any number of policies. A single policy is associated with a single property configuration. Within a policy version you define the rules that determine when the Cloudlet executes. You may want to create a new version of a policy to support a different business requirement, or to test new functionality.

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_akamai as akamai

        example = akamai.CloudletsPolicy("example",
            cloudlet_code="ER",
            description="policy description",
            group_id="grp_123",
            match_rules=\"\"\"  [
          {
            "name": "rule1",
            "type": "erMatchRule",
            "useRelativeUrl": "none",
            "statusCode": 301,
            "redirectURL": "https://www.example.com",
            "matchURL": "example.com",
            "useIncomingQueryString": false,
            "useIncomingSchemeAndHost": true
          },
          {
            "name": "rule2",
            "type": "erMatchRule",
            "matches": [
              {
                "matchType": "hostname",
                "matchValue": "3333.dom",
                "matchOperator": "equals",
                "caseSensitive": true,
                "negate": false
              }
            ],
            "useRelativeUrl": "none",
            "statusCode": 301,
            "redirectURL": "https://www.example.com",
            "useIncomingQueryString": false,
            "useIncomingSchemeAndHost": true
          }
        ]
        \"\"\")
        ```

        ## Import

        Basic usagehcl resource "akamai_cloudlets_policy" "example" {

        # (resource arguments)

         } You can import your Akamai Cloudlets policy using a policy name. For example

        ```sh
         $ pulumi import akamai:index/cloudletsPolicy:CloudletsPolicy example policy1
        ```

        :param str resource_name: The name of the resource.
        :param CloudletsPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CloudletsPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cloudlet_code: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 match_rule_format: Optional[pulumi.Input[str]] = None,
                 match_rules: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
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
            __props__ = CloudletsPolicyArgs.__new__(CloudletsPolicyArgs)

            if cloudlet_code is None and not opts.urn:
                raise TypeError("Missing required property 'cloudlet_code'")
            __props__.__dict__["cloudlet_code"] = cloudlet_code
            __props__.__dict__["description"] = description
            if group_id is None and not opts.urn:
                raise TypeError("Missing required property 'group_id'")
            __props__.__dict__["group_id"] = group_id
            __props__.__dict__["match_rule_format"] = match_rule_format
            __props__.__dict__["match_rules"] = match_rules
            __props__.__dict__["name"] = name
            __props__.__dict__["cloudlet_id"] = None
            __props__.__dict__["version"] = None
            __props__.__dict__["warnings"] = None
        super(CloudletsPolicy, __self__).__init__(
            'akamai:index/cloudletsPolicy:CloudletsPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cloudlet_code: Optional[pulumi.Input[str]] = None,
            cloudlet_id: Optional[pulumi.Input[int]] = None,
            description: Optional[pulumi.Input[str]] = None,
            group_id: Optional[pulumi.Input[str]] = None,
            match_rule_format: Optional[pulumi.Input[str]] = None,
            match_rules: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[int]] = None,
            warnings: Optional[pulumi.Input[str]] = None) -> 'CloudletsPolicy':
        """
        Get an existing CloudletsPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cloudlet_code: The two- or three- character code for the type of Cloudlet, either `ALB` for Application Load Balancer or `ER` for Edge Redirector.
        :param pulumi.Input[int] cloudlet_id: A unique identifier that corresponds to a Cloudlets policy type, either `0` for Edge Redirector or `9` for Application Load Balancer.
        :param pulumi.Input[str] description: The description of this specific policy.
        :param pulumi.Input[str] group_id: Defines the group association for the policy. You must have edit privileges for the group.
        :param pulumi.Input[str] match_rule_format: The version of the Cloudlet-specific `match_rules`.
        :param pulumi.Input[str] match_rules: A JSON structure that defines the rules for this policy
        :param pulumi.Input[str] name: The unique name of the policy.
        :param pulumi.Input[int] version: The version number of the policy.
        :param pulumi.Input[str] warnings: A JSON-encoded list of warnings.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CloudletsPolicyState.__new__(_CloudletsPolicyState)

        __props__.__dict__["cloudlet_code"] = cloudlet_code
        __props__.__dict__["cloudlet_id"] = cloudlet_id
        __props__.__dict__["description"] = description
        __props__.__dict__["group_id"] = group_id
        __props__.__dict__["match_rule_format"] = match_rule_format
        __props__.__dict__["match_rules"] = match_rules
        __props__.__dict__["name"] = name
        __props__.__dict__["version"] = version
        __props__.__dict__["warnings"] = warnings
        return CloudletsPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="cloudletCode")
    def cloudlet_code(self) -> pulumi.Output[str]:
        """
        The two- or three- character code for the type of Cloudlet, either `ALB` for Application Load Balancer or `ER` for Edge Redirector.
        """
        return pulumi.get(self, "cloudlet_code")

    @property
    @pulumi.getter(name="cloudletId")
    def cloudlet_id(self) -> pulumi.Output[int]:
        """
        A unique identifier that corresponds to a Cloudlets policy type, either `0` for Edge Redirector or `9` for Application Load Balancer.
        """
        return pulumi.get(self, "cloudlet_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of this specific policy.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Output[str]:
        """
        Defines the group association for the policy. You must have edit privileges for the group.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="matchRuleFormat")
    def match_rule_format(self) -> pulumi.Output[Optional[str]]:
        """
        The version of the Cloudlet-specific `match_rules`.
        """
        return pulumi.get(self, "match_rule_format")

    @property
    @pulumi.getter(name="matchRules")
    def match_rules(self) -> pulumi.Output[Optional[str]]:
        """
        A JSON structure that defines the rules for this policy
        """
        return pulumi.get(self, "match_rules")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The unique name of the policy.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[int]:
        """
        The version number of the policy.
        """
        return pulumi.get(self, "version")

    @property
    @pulumi.getter
    def warnings(self) -> pulumi.Output[str]:
        """
        A JSON-encoded list of warnings.
        """
        return pulumi.get(self, "warnings")
