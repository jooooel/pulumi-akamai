// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmapInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("srmap")]
        public Input<string>? Srmap { get; set; }

        [Input("value")]
        public Input<string>? Value { get; set; }

        public GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmapInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmapInputArgs Empty => new GetPropertyRulesBuilderRulesV20230530BehaviorSiteShieldSsmapInputArgs();
    }
}