// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteCloudletPolicyInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("id")]
        public Input<int>? Id { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteCloudletPolicyInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteCloudletPolicyInputArgs Empty => new GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteCloudletPolicyInputArgs();
    }
}